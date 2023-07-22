/**
 * JAVA中的异常以怎样的形式存在；
 * 1.异常在Java中以类的形式存在，每个异常类可以创建异常对象
 *
 * 编译时异常（受检异常、受控异常）
 * 运行时异常（未受检异常、非受控异常）
 * 强调：所有的异常都是发生在运行阶阶段；
 *
 *
 *
 * Java中对异常的处理方式有两种：
 * 1.在方法的声明的位置上，采用throws关键字（抛给上一级）
 * 2.采用try....catch语句进行异常的追捕；
 *
 *
 *
 * 注意：重写之后的方法不能比重写之前的方法抛出更多的异常，可以更少；
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe);
        NullPointerException npe = new NullPointerException("空指针异常");
        System.out.println(npe);

    }
}
