public class ceshiTest
{
	public static void main(String[] agrs)
	{
		//第一种初始化，引用的方法
		/*st s = new st();
		s.a = 10;
		*/
		
		
		//第二种初始化，构造方法调用构造方法
		//st s = new st();
		/*public st()
		{
		this(10);
		}*/




		//第三种初始化，创建对象时，直接初始化
		st s = new st(10);
		System.out.println(s.a );
	}
}
class st
{
	int a;
	public st()
	{
		
	}
	public st(int a)
	{
		this.a = a;
	}
}
