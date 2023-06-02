public class overrideTest02
{
	public static void main(String[] agrs)
	{
		//Chinese c1 = new Chinese("lan");//不能这样对name初始化，因为Chinese 中没有有参构造方法，
											//只有无参构造
		Chinese c1 = new Chinese();
		c1.setName("liang");
		c1.speak();
		American a1 = new American();
		a1.setName("mei");
		a1.speak();
		overrideTest02 t = new overrideTest02();
		System.out.println(t.toString());//输出overrideTest02@6b884d57
		Mydate d = new Mydate(2003,6,1);
		System.out.println(d);//重写toString前打印的使Mydate@77459877，重写后打印的是2000年10月1日
	}
}
class people
{
	private String name ;
	public people(){}
	public people(String name)
	{
		this.name = name;
	}
	public void speak()
	{
		System.out.println(name + "说什么语言");
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Chinese extends people
{
	public void speak()
	{
		System.out.println(getName() + "说汉语");
	}
}
class American extends people
{
	public void speak()
	{
		System.out.println(getName() + "说英语");
	}
}
class Mydate
{
	int year;
	int mouth;
	int day;
	public Mydate(){}
	public Mydate(int year,int mouth,int day)
	{
	this.year = year;
	this.mouth = mouth;
	this.day = day;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	public void setMouth(int mouth)
	{
		this.mouth = mouth;
	}
	public int getMouth()
	{
		return mouth;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	public String toString()
	{
		return year + "年" + mouth + "月" + day + "日";
	}
}