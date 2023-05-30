public class this1
{
	int i = 1000;
	public static void main(String[] agrs)
	{
		//System.out.println(i);	
		//	this1.java:6: 错误: 无法从静态上下文中引用非静态 变量 i
	this1 a = new this1();
	System.out.println(a.i);
	a.hello();//实例方法的调用
	hello1();
	System.out.println(a.i);
	}
	public void hello()
	{
		i++;
		System.out.println(i);//这里的i相当于this.i
	}
	public static void hello1()
	{

		this1 b = new this1();
		b.i++;
		System.out.println(b.i);
	}
	/*
	this 是一个关键字，是一个变量，一个引用。
	this 保存当前对象的地址，严格来说，this就是当前对象
	谁调用实例变量，this就是谁
	this 存储在堆内存当中对象的内部
	this只能用于实例方法，不能用于是static方法中
	静态方法中不存在当前对象。
	
	*/
}