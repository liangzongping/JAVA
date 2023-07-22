public class ExceptionTest3 {
    /**
     *  public static void main(String[] args) throws ClassNotFoundException{
     *
     *         dosome();//直接调用会编译过不去，因为没有处理异常
     *                  //处理异常有两种方式：1.抛出异常   2.
     */
    public static void main(String[] args) {
        //第二种处理方法//try...catch捕捉异常
        //捕捉等于把异常拦下来，一场真正解决了（调用者不知道）
        try {
            dosome();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void dosome()throws ClassNotFoundException
    {
        System.out.println("dosome");
    }
}
