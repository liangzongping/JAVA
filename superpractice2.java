public class superpractice2
{
	public static void main(String[] agrs)
	{
		new C();
	}

}
class A
{
	public A()
	{
		System.out.println("1");
	}
	
}
class B extends A
{
	public B()
	{
		System.out.println("2");
	}
	public B(String name)
	{
		//super();这里实际上有这个语句//调用父类的无参构造方法
		System.out.println("3");
	}
}
class C extends B
{
	public C()
	{
		this("liang");//调用本类的另一个构造方法
		System.out.println("4");
	}
	public C(String name)
	{
		this("zong",10);//调用本类的另一个构造方法
		System.out.println("5");
	}
	public C(String name,int i)
	{
		super("ping");//调用父类的有参构造方法
		System.out.println("6");
	}
}