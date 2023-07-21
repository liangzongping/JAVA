public class StringBuffertest {
    public static void main(String[] args) {
        /**
         * 以下代码会给方法区的字符常量池造成很大压力；
         * 浪费方法区的内存空间
         */
        String s = "0";
        System.out.println(s);
        int i ;
        for(i = 1;i<=100;i++)
        {
            s += i;
            System.out.println(s);
        }
    }
}
