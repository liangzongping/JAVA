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
        byte[] b = {97,98,99};
        String s = new String(b);
        System.out.println(s);//输出abc;   实际上是System.out.println(s.toString());也说明了String
                                //已经重写了toString方法；直接输出字符串本身；
        String s6 = new String(b,1,2);
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
        System.out.println("==================================");
        //equalsIgnoreCase判断两个字符串是否相等（忽略大小写）
        System.out.println("AbC".equalsIgnoreCase("aBc"));//输出true;
        //getBytes();将一个字符串转换为一个byte数组；
        byte[] n = "abcde".getBytes();
        int k;
        for(k = 0;k<n.length;k++)
        {
            System.out.println(n[k]);
        }
        //indexof判断某个字串在字符串中第一次出现的索引
        System.out.println("helloworld.java".indexOf("world"));//输出5
        System.out.println("============================");
        //isEmpty判断某个字符串是否为空
        System.out.println("".isEmpty());//输出true;
        System.out.println("a".isEmpty());//输出false;
        System.out.println("=====================================");
        //length计算字符串的长度
        System.out.println("abc".length());//输出3，注意这里的length()是一个方法，与数组中的length属性不同；
    }

}
