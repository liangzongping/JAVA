public class fengzhuangTest2
{
	public static void main(String[] agrs)
	{
		person a = new person();
		int s = a.getAge();
		System.out.println(s);
		a.setAge(100);
		System.out.println(a.getAge());
	}
}