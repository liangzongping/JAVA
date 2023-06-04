/*
super 的语法：super.和super()
super可以用在实例方法和构造方法中，不能使用在静态方法
super大多数情况是可以省略的
super只能出现在构造方法的第一行，通过当前的构造方法去调用父类中的构造方法，目的是创建子类对象的时候，先初始化父类的特征
*/

/*
结论：1.super()和this()不能共存，当构造方法第一行没有super和this时，系统会默认提供super();
	  2.子类想要调用父类的无参构造方法时，必须保证父类的无参构造方法存在；
	  3.父类的构造方法一定会执行的
*/
public class super1
{
	public static void main(String[] agrs)
	{
		 credit c = new credit();
		 System.out.println(c.id);
		 System.out.println(c.name);
		 System.out.println(c.c);
		 /*
				account的无参构造
				credit的无参构造
		 */
		 //说明credit对象调用了父类account的无参构造
	}
}

class account
{
	int id;
	String name;
	public account()
	{
	id = 10101;
	name = "liang";
	}
	public account(int i) 
	{
		System.out.println("account的无参构造");
	}
	
	/*
	public account(int i) 
	{
		System.out.println("account的无参构造");
	}
	super1.java:34: 错误: 无法将类 account中的构造器 account应用到给定类型;
        {
        ^
	需要: int
	 找到:    没有参数
	 原因: 实际参数列表和形式参数列表长度不同
	1 个错误
	*/



}
class credit extends account
{
	//这里默认有super();
	int c ;
	public credit()
	{
		c = 6666;
		System.out.println("credit的无参构造");
	}
	
}