/**
 * 抽象类的定义
 * 【修饰符列表】 abstract class {
 *     类体
 * }
 * 抽象类无法实例化，所以抽象类是用来继承的
 * 抽象类虽然无法实例化，但是他有构造方法，能够供子类使用。
 * 抽象方法表示没有实现的方法，没有方法体的方法
 * eg:public abstract void dosome();
 * 抽象方法必须出现在抽象类中；
 * 父类中有抽象方法，子类不是抽象类，子类必须重写父类的抽象方法
 */
public class AbstractTest {
    public static void main(String[] args) {
    //new A();
    //错误：'A' 为 abstract；无法实例化
       C c =  new D();//多态
        c.move();
    }
}
/*final abstract class A{

}*/
//非法的修饰符组合: 'final' 和'abstract'
abstract class A{
//public A(int i){}//若这里有一个有参构造，那么23行会报错：'A' 中没有可用的默认构造函数。
}
//抽象类的子类也可以是抽象类；
abstract class B extends A{

}
abstract class C{
    public abstract void move();
}
class D extends C{
    //没覆盖move()方法之前，有报错。类 "D" 必须声明为抽象，或为实现 "C" 中的抽象方法 "move()"
    //所以必须重写move方法；

    public void move() {
        System.out.println("移动");
    }
}


