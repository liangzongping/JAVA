/**
 * 八种基本数据类型对应的八个包装类
 * 基本数据类型       包装类
 * byte             java.lang.Byte
 * short            java.lang.Short
 * int              java.lang.Integer
 * long             java.lang.Long
 * float            java.lang.Float
 * double           java.lang.Double
 * boolean          java.lang.Boolean
 * char             java.lang.Character
 */
//八个包装类中有6个是数字对应的包装类，他们的父类都是number
//number类是一个抽象类，无法实例化
//number类中有公共方法，eg:byte byteValue();以byte形式返回指定数值；
//自动装箱：基本数据类型自动转化为包装类；
//自动拆箱：包装类自动转化为基本数据类型；

/**
 * 常见的经典异常
 * 1.空指针异常： NullPointerException
 * 2.类型转换异常: ClassCastException
 * 3.数组下标越界异常: ArrayIndexOutOfBoundException
 * 4.数字格式化异常: NumberFormatException
  */
public class baozhuangTest {
    public static void main(String[] args) {
        Integer i;//包装类
        int j;//基本数据类型；
        //将基本数据类型转化为引用数据类型（装箱）；
        Float f = new Float(123.0);
        //将引用数据类型转化为基本数据类型（拆箱）；
        int k = f.intValue();
        System.out.println(k);
        System.out.println("int的最大值是  "+Integer.MAX_VALUE);
        // Integer n  = new Integer("nb");
        //出错：NumberFormatException: For input string: "nb"；
        //重要方法 parseInt();静态方法；将字符串转化为数字
        int n = Integer.parseInt("1881");
        //int b = Integer.parseInt("你好");//出错，NumberFormatException
        System.out.println(n);
        //同样的有下面的
        double v = Double.parseDouble("3.14");
        System.out.println(v);
        //十进制转化为二进制
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);//输出11
        //十进制转化十六进制字符串
        String hexString  = Integer.toHexString(16);
        System.out.println(hexString);//输出10
        //十进制转化为八进制
        String octalString  = Integer.toOctalString(8);
        System.out.println(octalString);
        //valueOf
        Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf("100");
        System.out.println(n1);
        System.out.println(n2);

    }

}
