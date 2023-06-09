/**
 * 类与类之间的叫做继承。类与接口之间叫做实现（与继承差不多，可以看作继承）
 * 继承：extends
 * 实现：implememts
 */
public class interfaceTest1 {
    public static void main(String[] args) {
    animal a  = new cat();
    a.fly();
    test t = new test();
    //   K x = (K)t;//接口之间没继承关系也可以强转，但这样做虽没有语法错误，但会有ClassCastException；
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
class animal{
    public void fly(){

    }
}
interface flyable{
    void fly();
}


class cat extends animal implements flyable//extends和implements一起用的做法
{
    public void fly()
    {
        System.out.println("猫会飞");
    }
}
interface K{

}
interface J{

}
class test implements J
{

}



