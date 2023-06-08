/**
 * 类与类之间的叫做继承。类与接口之间叫做实现（与继承差不多，可以看作继承）
 * 继承：extends
 * 实现：implememts
 */
public class interfaceTest1 {
    public static void main(String[] args) {

    }
}
interface Mymath{
    int i = 1000;
    int sum(int a,int b);
    int sub(int a,int b);
}
class T implements Mymath{
    //重写实现
    public int sum(int a,int b)
    {
        return a+b;
    }
    //重写实现
    public int sub(int a, int b) {
        return a-b;
    }
}


