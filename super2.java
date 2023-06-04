public class super2
{
	public static void main(String[] agrs)
	{
		monitor m = new monitor(666);
		System.out.println(m.getNum());
		System.out.println(m.getName());
		System.out.println(m.getId());
		//101
		//liang
		//666
	}
}
class student 
{
	private int num;
	private String name;
	public student() {}
	public student(int num,String name)
	{
		this.num = num;
		this.name = name;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	public void setName(String num)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class monitor extends student
{
	private int id ;
	public monitor(){}
	public monitor(int id)
	{
		super(101,"liang");
		this.id = id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
}