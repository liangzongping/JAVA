/**
 * java中如何自定义异常？
 * 第一步：编写一个类继承Exception和RuntimeException
 * 第二部：提供两个构造方法，一个无参的，一个带有String参数的
 */
//自定义编译时异常
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

/**
 * //自定义运行时异常
 * public class MyException extends RuntimeException{
 *     public MyException() {
 *     }
 *
 *     public MyException(String message) {
 *         super(message);
 *     }
 * }
 */