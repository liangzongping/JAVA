public class this2
{
	public static void main(String[] args)
	{
	
		student s1 = new student(1,"梁宗平");
		student s2 = new student(2,"张三");
		System.out.println("学号：" + s1.getNum() + "\n" + "姓名：" + s1.getName() );
		System.out.println("学号：" + s2.getNum() + "\n" + "姓名：" + s2.getName() );
		s2.setNum(6);
		s2.setName("李四");
		System.out.println("学号：" + s2.getNum() + "\n" + "姓名：" + s2.getName() );
		student s3 = new student();
		System.out.println("学号：" + s3.getNum() + "\n" + "姓名：" + s3.getName() );
	
	}
}
/*class student
{
	private int num;
	private String name;
	//无参构造
	public student(){};
	//有参构造
	public student(int i,String s)//注意构造器是这样写的，没有返回值
	{
		num = i;
		name = s;
	}
	//实例方法
	public void setNum(int i)//这里的i,s 变量名没有意义//
	{
		num = i;
	}
	public int getNum()
	{
		return num;
	}
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}
	 
}*/
class student
{
	private int num;
	private String name;
	//无参构造
	public student()
	{
	this(89,"赵云");//通过调用另一个构造方法来初始化实例变量；this()相当于s3();
					//注意只能调用本类的构造方法，并且this();这样的调用只能在第一行出现；
	};
	//有参构造
	public student(int num,String name)//构造方法
	{
		this.num = num;
		this.name = name;
	}
	//实例方法
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	 //上面的this都是指student类对象（s1或s2）
	 //这里this的作用是在实例方法或构造方法中区分局部变量
}