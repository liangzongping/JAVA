public class finalTest1 {
    public static void main(String[] args) {
    final person p = new person(10,"liang");
        System.out.println("age = " + p.age + "\nname = " + p.name );
        // p = new person(10,"zong");
        // 无法将值赋给 final 变量 'p'
        user u  = new user();
        System.out.println(u.a);
    }

}
class person
{
    int age;
    String name;

    public person() {
    }

    public person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
class user{
    //final int a;
    //错误：变量 'a' 可能尚未初始化
    //final int a = 10;
    final int a;

    public user() {
        a = 10;
    }
}
/**
 * 结论：final修饰的实例变量一定要手动初始化，有两种方式初始化，
 * 1.直接等于 eg:final int a = 10;
 * 2.在构造方法中赋初值，eg:    public user() {a = 10;}
 * 3.final修饰的实例变量一般都用static修饰
 * 4.static final 修饰的变量叫做常量，常量的命名一般用大写字母，单词与单词之间用下划线隔离
 *  eg:static final String  COUNTRY  = "中国"；
 *  常量与静态变量一样，区别是常量不能改变，他们都存放在方法区，都是在类加载时初始化。
 *  常量一般是公开的，用public修饰
 */