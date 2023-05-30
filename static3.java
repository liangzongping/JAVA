//实例代码区，这也是个时机，叫做对象构建时机
public class static3
{
	{
		System.out.println("你好");
	}
	public static void main(String[] agrs)
	{
		System.out.println("main begin");//main begin 先打印出来，说明实例代码区不执行
		System.out.println("卢本伟nb");
		static3 a = new static3();
		System.out.println("66666");
		a.hello();//先打印 你好 ，说明调用构造方法前，先执行实例代码区
		a.hello("lisi");
		static3 b = new static3();
		b.hello("liang");
		static3 c = new static3();//每个new 前都有 你好 ，而且从“卢本伟nb”和“66666”说明
								  //每次创建对象前先执行实例代码区
		c.hello();
	}

	public void hello()
	{
	 System.out.println("helloworld");
	}
	public void hello(String name)
	{
	 System.out.println("helloworld6666");
	}
}


 

