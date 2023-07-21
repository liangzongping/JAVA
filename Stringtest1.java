import jdk.swing.interop.SwingInterOpUtils;

/**
 * 所有带双引号的都是存放在方法区的字符串常量池中，eg:"abc";
 */
public class Stringtest1 {
    public static void main(String[] args) {
        //以下代码创建了三个字符串常量；
        String s1 = "abc";
        String s2 = "abc" + "def";
        //“abc”一个，“def”一个，"abcdef"一个；
        //下面代码表示创建了一个存储在堆区的s3对象，对象里面存放着在方法区中的字符串常量区的"abc"的内存地址
        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s4 == s1);//输出true;因为s1与s2存放的都是字符串常量区中的“abc”是同一个地址；
        String s5 = new String("abc");
        System.out.println(s3 == s5);//输出false;因为s3与s4是存放两个对象的地址
        System.out.println(s3.equals(s5));//输出true;String已经重写了equals方法；
        System.out.println("abc".equals(s5));//建议这样写，可以避免空指针异常；
        System.out.println("====================================");
        byte[] b = {97, 98, 99};
        String s = new String(b);
        System.out.println(s);//输出abc;   实际上是System.out.println(s.toString());也说明了String
        //已经重写了toString方法；直接输出字符串本身；
        String s6 = new String(b, 1, 2);
        System.out.println(s6);//输出bc
        //抽取字符串中的一个字符
        char c = "赵子龙".charAt(1);
        System.out.println(c);//输出"子"；
        System.out.println("============================");
        //比较两个字符串是否相等
        int i = "abc".compareTo("abc");//前后相等 eg:1-1 = 0
        System.out.println(i);//输出0；
        int i1 = "abcd".compareTo("abcf");//前小后大  1 - 3 = -2
        System.out.println(i1);//输出-2
        int i2 = "abcf".compareTo("abcd");//前大后小  3 - 1 = 2;
        System.out.println(i2);//输出2；
        //contains判断前面的的字符串是否包含后面的字符串；
        System.out.println("helloworld.java".contains(".java"));//输出true;
        System.out.println("helloworld.com".contains(".java"));//输出false;
        //endsWith判断某个字符串是否以某个字符串结尾
        System.out.println("==================================");
        System.out.println("helloworld.java".endsWith("ava"));//输出true;
        System.out.println("helloworld.java".endsWith("avb"));//输出false;
        //startsWith判断某个字符串是否以某个字符串开始
        System.out.println("==================================");
        System.out.println("helloworld.java".startsWith("hello")+"1");//输出true;
        System.out.println("helloworld.java".startsWith("helo")+"2");//输出false;
        System.out.println("==================================");
        //equalsIgnoreCase判断两个字符串是否相等（忽略大小写）
        System.out.println("AbC".equalsIgnoreCase("aBc"));//输出true;
        //getBytes();将一个字符串转换为一个byte数组；
        byte[] n = "abcde".getBytes();
        int k;
        for (k = 0; k < n.length; k++) {
            System.out.println(n[k]);
        }
        //indexof判断某个字串在字符串中第一次出现的索引
        System.out.println("helloworld.java".indexOf("world"));//输出5
        System.out.println("============================");
        //isEmpty判断某个字符串是否为空
        System.out.println("".isEmpty());//输出true;
        System.out.println("a".isEmpty());//输出false;
        System.out.println("============ =========================");
        //length计算字符串的长度
        System.out.println("abc".length());//输出3，注意这里的length()是一个方法，与数组中的length属性不同；
        System.out.println("=====================================");
        //lastindexOf返回要查找的子串在字符串中最后一个出现的索引
        System.out.println("java.helloworld.java".lastIndexOf("ava"));//输出17；
        System.out.println("==========================");
        //replace替换字符串中的某个子串
        String h = "helloworld.c";
        System.out.println(h.replace(".c", ".java"));//该方法返回新的字符串；
        System.out.println("=========================");
        //split//按某个字符拆分；返回的字符串存放在数字中
        String[] o = "name=zhangsan&age=19&address=beijing".split("&");
        for(i=0;i<o.length;i++)
        {
            System.out.println(o[i]);
        }
        System.out.println("======================");
        //substring截取字符串
        System.out.println("https.//www.baidu.com".substring(8));
        System.out.println("https.//www.baidu.com".substring(8,11));
        System.out.println("=========================");
        //toCharArray将字符串转换为字符数组
        char[] c2 = "我是中国人".toCharArray();
        for(i = 0;i<c2.length;i++)
        {
            System.out.println(c2[i]);
        }
        System.out.println("============================");
        //toLowerCase全部转换为小写
        System.out.println("ABCEdnUOAFFJ".toLowerCase());
        //toUpperCase全部转换为大写
        System.out.println("bvazDFAdsjfaKFJDA".toUpperCase());
        //trim()去除字符串前后空白
        System.out.println("       hello    world    ".trim());
        //String 中只有一个静态方法，不需要new对象；这个方法是valueOf();
        //作用：将非字符串转化为字符串；
        String k1 = String.valueOf(true);
        System.out.println(k1);//输出的是字符串true,不是布尔类型的true;
    }
//String 是为什么不可变的
//String类我看过源代码，String类中有一个byte数组，并且这个byte数组是使用final修饰的
//因为数组一旦创建后长度是不可变的，并且final修饰的饮用后指向的对象不可指向其他对象，所以String是不可变的；
/**
 * String s = "abc";
 * s = "def";
 * 以上操作是可以的；
 * “abc” = “def”；//不可以，字符串不可变；
 */

/**
 * StringBuffer为什么可变
 * 我看过源代码，因为StringBuffer内部实际上是同一个byte[]数组，这个byte数组没有被final修饰，
 * StringBuffer的初始化容量我记得是16，当数据存满的时候会进行扩容，扩容采用了数组拷贝的方法（System.arraycopy()）
 * 所以StringBuffer适合用于字符串拼接操作。
  */

}
