public class MyExceptionTest {
    public static void main(String[] args) {
        //创建异常对象，没有手动抛出；
        MyException m = new MyException("用户名出错");
       //获取异常信息
        String s = m.getMessage();
        System.out.println(s);
        //打印异常堆栈信息；
        m.printStackTrace();
    }
}
