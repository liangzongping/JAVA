public class StringBuffertest1 {
    public static void main(String[] args) {
        //以后进行字符串的大量拼接就使用JDK中的StringBuffer方法；
        StringBuffer s = new StringBuffer(19);//给定容量
        s.append("abc");
        s.append(9);
        s.append("def");
        System.out.println(s);
        //如何优化StringBuffer？初始化为16
        //在使用StringBuffer之前先预算以下要拼接的大小，给定一个初始化容量；
        //尽量减少数组扩容的次数；
    }
}
