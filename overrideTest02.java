public class overrideTest02
{
	public static void main(String[] agrs)
	{
		//Chinese c1 = new Chinese("lan");//����������name��ʼ������ΪChinese ��û���вι��췽����
											//ֻ���޲ι���
		Chinese c1 = new Chinese();
		c1.setName("liang");
		c1.speak();
		American a1 = new American();
		a1.setName("mei");
		a1.speak();
		overrideTest02 t = new overrideTest02();
		System.out.println(t.toString());//���overrideTest02@6b884d57
		Mydate d = new Mydate(2003,6,1);
		System.out.println(d);//��дtoStringǰ��ӡ��ʹMydate@77459877����д���ӡ����2000��10��1��
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
		System.out.println(name + "˵ʲô����");
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
		System.out.println(getName() + "˵����");
	}
}
class American extends people
{
	public void speak()
	{
		System.out.println(getName() + "˵Ӣ��");
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
		return year + "��" + mouth + "��" + day + "��";
	}
}