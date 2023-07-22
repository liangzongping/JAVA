/**
 * final,finally,finalize
 * final是一个关键字，表示最终的，不可变的；
 * finally是一个关键字，和try连用，使用在异常处理机制中
 * finalize是Object类中的一个方法，作为方法名出现，所以finalize是一个标识符，这个方法有gc垃圾回收器调用；
 *
 */
public class finallyTest1 {
    public static void main(String[] args) {
            int ret = m();
        System.out.println(ret);//输出 100
    }
    public static int m()
    {
        int i = 100;
        try {
            return i;//第一次执行到这先返回数据
        }finally {
            i++;//i++一定在return前执行的
        }
    }
}
