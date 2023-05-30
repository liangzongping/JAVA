public class nullpointTest1
{
	public static void main(String[] agrs)
	{
		//有static 的调用方法
		dosome();
		//无static 的调用方法，该方法的级别是对象级别的（也就是实例方法），故需要创建对象，用对象调用dosome1，而不是
		//用类调用
		nullpointTest1 s = new nullpointTest1();
		s.dosome1();
		s = null;
		s.dosome1();
		/*Exception in thread "main" java.lang.NullPointerException
        at nullpointTest1.main(nullpointTest1.java:12)*/
		//说明实例方法、实例变量都不能空指针访问
	}
	public static void dosome()
	{
	  System.out.println("dosome!!!!!");
	}
	public void dosome1()
	{
		System.out.println("helloworld !!!!");
	}
}
class user
{
	int age;
}