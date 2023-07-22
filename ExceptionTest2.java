public class ExceptionTest2 {
    public static void main(String[] args) {
        //100/0是ArithmeticException；NEW了一个异常对象，
        // 然后抛给了上一级main，main又抛给了JVM，最终JVM终止了程序的运行
        System.out.println(100/0);
        System.out.println("helloworld");
    }
}
