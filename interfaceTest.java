/**
 * 接口是一个引用数据类型，编译后也是一个class字节码文件
 * 接口是完全抽象的，抽象类是半抽象
 * 接口的定义语法：【修饰表列符】 interface 接口名{
 *接口中只有常量和抽象方法；
 * }
 */
public class interfaceTest {
    public static void main(String[] args) {

    }
}
class user{
    public int i;
}
interface A{

}
interface B {

}
interface C extends A,B//接口支持多继承，类的继承只支持单继承；
{

}
interface Mymath{
        //接口中的所有的东西被public修饰
        // public abstract int dosome(int i,int j);
        int dosome(int i,int j);//public abstract 可以省略
       // public static final int a = 1000;
        int a = 1000;//public static final可以省略
        }

