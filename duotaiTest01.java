/*
多态的基础语法
1.向上转型（子转父）（自动类型转换）
2.向下转型（父转子）（强制类型转换（有风险），需要加强制转换符）//什么时候使用，访问子类特有的方法时可以使用。
3.这两种类型java都允许，必须有继承关系。*****重点

*/
/*、
什么叫做多态
多种形态，多种状态

*/
public class duotaiTest01
{
	public static void main(String[] agrs)
	{
		animal a = new animal();
		a.move();
		bird b =new bird();
		b.move();
		cat c  = new cat();
		c.move();
		System.out.println("------------------------------");
		animal a1 = new cat();
		a1.move();
		cat x  = (cat)a1;//强制转换a1,换成cat类就可以使用catchmouse();
		x.catchmouse();

		System.out.println("------------------------------");
		
		animal a2 = new bird();
		System.out.println(a2 instanceof cat);
		if(a2 instanceof cat)//a2实际上是个bird类
		{
			cat  c3 = (cat)a2;//
			c3.catchmouse();
		}
		
		/*
		编译通过了,但运行出错了，因为a2实际上是个bird类，这里是bird转换为cat,这两个没有继承关系，不能进行转型
		Exception in thread "main" java.lang.ClassCastException: class bird cannot be 
		cast to class cat (bird and cat are in unnamed module of loader 'app')
        at duotaiTest01.main(duotaiTest01.java:32)
		*/
		//这个经典异常类转换错误异常：ClassCastException
		/*
		怎么避免这个异常类转换错误呢？
		采用instanceof
		1.instanceof可以在运行阶段动态判断引用指向的对象类型
		2.instanceof的语法：c instanceof cat//这个返回的是true或flase
		3.做向下转型时一定要用instanceof来判断要被转型的
		
		
		
		
		*/







		/*
		animal a1 是一个父类型的引用，而new cat()是一个子类型的对象
		//这种就作向上转型
		*/
		/*
		java中分为编译阶段和运行阶段
		在编译阶段中，编译器会认为a1是一个animal类，在检查语法时，编译会去animal中找move();
		编译通过，静态绑定成功（编译阶段属于静态绑定）

		在运行阶段，a1在堆内存中开辟的是cat对象，所以在引用move();的时候，引用的是cat类中的move();
		这个叫做运行阶段绑定，（运行阶段属于动态绑定）
		*/

		//a1.catchmouse();出错，编译不通过，原因是a1是animal类，这个类中没有catchmouse();
		/*
		duotaiTest01.java:24: 错误: 找不到符号
                a1.catchmouse();
                  ^
		 符号:   方法 catchmouse()
		 位置: 类型为animal的变量 a1
			1 个错误
		*/

		
		//cat c2 = new animal();
		//c2.move();
		/*
		E:\JAVAproject\day19>javac duotaiTest01.java
		duotaiTest01.java:26: 错误: 不兼容的类型: animal无法转换为cat
                cat c2 = new animal();
                         ^
		1 个错误
		*/
	}	          
}
class animal
{
	public void move()
	{
		System.out.println("动物在移动");
	}
}
class bird extends animal
{
	public void move()
	{
		System.out.println("鸟儿在飞翔");
	}
}
class cat extends animal
{
	public void move()
	{
		System.out.println("猫在走路");
	}
	public void catchmouse()
	{
		System.out.println("猫抓老鼠");
	}
}