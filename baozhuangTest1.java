public class baozhuangTest1 {
    public static void main(String[] args) {
       //自动装箱
        Integer a = 100;//相当于Integer a = new Integer(100);
        //自动拆箱
        int b = a;//相当于int b = a.intValue();

        Integer c = 1000;
        Integer d = 1000;
        System.out.println(a+1);//输出101

        System.out.println(d == c);//输出false，不在-127到127之间
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);//输出true，在-127到127之间

        /**
         * 在java中，为了提高执行效率，-127到127之间包装的对象会提前创建好并放到方法区中
         * 整型常量池中去，目的是只要在这个区的数据就不需要new对象，直接在整型常量区中获取；
         */
    }
}
