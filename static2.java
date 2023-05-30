/*
1.静态代码块；
static
{
	java语句；
}
2.类加载时执行，且执行一次；并且在main方法前执行
3.一般按照自上而下的顺序执行
作用：在类加载时的一个时机：程序员可以在此时做一些准备工作
*/
/*public class static2
{
	static 
	{
		System.out.println("a");
	}
	static 
	{
		System.out.println("b");
	}
	static 
	{
		System.out.println("c");
	}
	public static void main(String [] args)
	{
		System.out.println("1");
	}
}*/
public class static2
{
	/*
	static 
	{	
		System.out.println("i=" + i );
	}
	static int i = 100;
	public static void main(String[] agrs)
	{
		System.out.println("你好");
	}*/


    //不能运行；
	/*static2.java:35: 错误: 非法前向引用
                System.out.println("i=" + i );
                                          ^
	1 个错误*/

	
	
	
	


	
	/*
	int i = 100;//因为i是实例变量，在对象创建后才开辟空间
	static 
	{	
		System.out.println("i=" + i );//这里用了未开辟的变量i；
	}
	
	public static void main(String[] agrs)
	{
		System.out.println("你好");
	}
	*/


	/*E:\JAVAproject\day15>javac static2.java
	static2.java:52: 错误: 无法从静态上下文中引用非静态 变量 i
                System.out.println("i=" + i );
                                          ^
	1 个错误*/

}