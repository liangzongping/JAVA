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
		//super();����ʵ������������//���ø�����޲ι��췽��
		System.out.println("3");
	}
}
class C extends B
{
	public C()
	{
		this("liang");//���ñ������һ�����췽��
		System.out.println("4");
	}
	public C(String name)
	{
		this("zong",10);//���ñ������һ�����췽��
		System.out.println("5");
	}
	public C(String name,int i)
	{
		super("ping");//���ø�����вι��췽��
		System.out.println("6");
	}
}