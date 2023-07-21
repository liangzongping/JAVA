public class StringbuilderTest {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        b.append("hello");
        b.append("world");
        System.out.println(b);
        //StringBuffer和StringBuilder都是用于拼接的
        //StringBuffer与StringBuilder的区别是：StringBuffer中的方法都是有synchronized关键字修饰
        //StringBuild中的方法都是没有synchronized关键字修饰
        //StringBuffer是线程安全的
        //StringBuilder是非线程安全的
    }
}
