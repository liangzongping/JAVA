public class extendsTest01
{
	public static void main(String[] agrs)
	{
		student1 s1 = new student1(12,"������",6666);
		student2 s2 = new student2();
		s2.setAge(18);
		s2.setName("�ŷ�");
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
	//s2�ĳ�ʼ��ֻ��һ��һ����ʼ����,��Ϊû�м̳й��췽����
	
	}
}
class student1
{
	private int age ;
	private String name ;
	private int num;
	//�޲ι��췽��
	public student1(){}
	//�вι��췽��
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
//�̳У��������ã�����̳и��࣬ʹ������Եõ�����
//		��Ҫ���ã����˼̳У������˺���ķ������ǺͶ�̬����
//class a extends b   �����b ����Ϊsuperclass ���� ���� ����   a ���� subclass ������ ���� 
//javaֻ֧�ֵ��̳У���������д��class a extend b,c
//���Լ̳г����췽��֮�⣬�����Լ̳У�˽�л����Բ���ֱ�ӷ���
//���е���Ĭ�ϼ̳�object�����
//�̳�Ҳ����ȱ��ģ���϶�̫�ߣ������޸ģ�������յ�ǣ����