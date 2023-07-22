import java.io.FileInputStream;
import java.io.FileNotFoundException;

//第一种处理异常方法：throws 谁调用这个方法，我就抛给谁；
//throws 可以抛多个异常；
//100/0属于运行时异常，编译时可以处理，也可以不处理；
public class ExceptionTest4 {
    //一般不在main方法上抛出异常，因为main方法会把异常抛给jvm，jvm会终止程序的运行
    //所以main方法中的异常一般会用try 。。。catch进行捕捉
    public static void main(String[] args)  {
        System.out.println("m1 begin");
        try {
            m1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1 end");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m2 begin");
        m2();
        System.out.println("m2 end");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m3 begin");
        m3();
        System.out.println("m3 end");
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("E:\\JAVAproject\\day1");
    }
}
