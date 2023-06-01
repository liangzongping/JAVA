public class extendsTest01
{
	public static void main(String[] agrs)
	{
		student1 s1 = new student1(12,"赵子龙",6666);
		student2 s2 = new student2();
		s2.setAge(18);
		s2.setName("张飞");
		s2.setNum(8888);
		s2.setAddress("beijing");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		System.out.println(s1.getNum());
		System.out.println("----------------------");
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		System.out.println(s2.getNum());
		System.out.println(s2.getAddress());
	//s2的初始化只能一个一个初始化了,因为没有继承构造方法。
	
	}
}
class student1
{
	private int age ;
	private String name ;
	private int num;
	//无参构造方法
	public student1(){}
	//有参构造方法
	public student1(int age,String name,int num)
	{
		this.age = age;
		this.name = name;
		this.num = num;
	}
	public void setAge(int age )
	{
	this.age = age;
	}
	public int getAge()
	{
		return age;
	}

	public void setName(String name )
	{
	this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setNum(int num )
	{
	this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	
}
class student2 extends student1
{
	private String address;
	public student2(){}
	public student2(String address)
	{
		this.address = address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress()
	{
		return address;
	}
}
//继承：基本作用：子类继承父类，使代码可以得到复用
//		重要作用：有了继承，就有了后面的方法覆盖和多态机制
//class a extends b   这里的b 称作为superclass 超类 父类 基类   a 称作 subclass 派生类 子类 
//java只支持单继承，不能这样写：class a extend b,c
//可以继承除构造方法之外，都可以继承，私有化属性不能直接访问
//所有的类默认继承object这个类
//继承也是有缺点的，耦合度太高，父类修改，子类会收到牵连；