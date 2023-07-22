import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于try .... catch中的finally子句
 * 1.finally子句中的代码是一定会最后执行的，即使try中的代码出现的问题；
 * 2.finally和try一定是同时在一起的，不能单独编写；
 *
 *
 *
 * finally语句通常用在哪些情况
 * 1.通常在finally中完成资源的释放/关闭
 *
 *
 *
 *
 * try和finally、return的执行顺序
 * 先try
 * 后finally
 * 最后return
 *
 *
 * System.exit(0);表示推出jvm，退出jvm后finally中的语句就不执行了；
 */
public class finallyTest {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            f = new FileInputStream("D:\\桌面");
            String n = null;
            n.toString();
            System.out.println("helloworld");
           // f.close();//因为上面出现了空指针异常。导致了流不能关闭；
        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }finally {
            if(f!=null)
            {
                //这里用try是因为f出现了异常，采用try...catch进行捕捉；
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
