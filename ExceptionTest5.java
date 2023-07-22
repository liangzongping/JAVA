public class ExceptionTest5 {
    public static void main(String[] args) {
        NullPointerException e = new NullPointerException("nihao");
        //getMessage();获取异常简单描述信息：实际上就是构造方法上的String参数
        String n = e.getMessage();
        System.out.println(n);
        //打印异常堆栈信息；
        //java在打印异常堆栈信息的时候，采用了异步线程的方式打印；
        e.printStackTrace();
        System.out.println("helloworld");
    }
}
