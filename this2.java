public class this2
{
	public static void main(String[] args)
	{
	
		student s1 = new student(1,"����ƽ");
		student s2 = new student(2,"����");
		System.out.println("ѧ�ţ�" + s1.getNum() + "\n" + "������" + s1.getName() );
		System.out.println("ѧ�ţ�" + s2.getNum() + "\n" + "������" + s2.getName() );
		s2.setNum(6);
		s2.setName("����");
		System.out.println("ѧ�ţ�" + s2.getNum() + "\n" + "������" + s2.getName() );
		student s3 = new student();
		System.out.println("ѧ�ţ�" + s3.getNum() + "\n" + "������" + s3.getName() );
	
	}
}
/*class student
{
	private int num;
	private String name;
	//�޲ι���
	public student(){};
	//�вι���
	public student(int i,String s)//ע�⹹����������д�ģ�û�з���ֵ
	{
		num = i;
		name = s;
	}
	//ʵ������
	public void setNum(int i)//�����i,s ������û������//
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
	//�޲ι���
	public student()
	{
	this(89,"����");//ͨ��������һ�����췽������ʼ��ʵ��������this()�൱��s3();
					//ע��ֻ�ܵ��ñ���Ĺ��췽��������this();�����ĵ���ֻ���ڵ�һ�г��֣�
	};
	//�вι���
	public student(int num,String name)//���췽��
	{
		this.num = num;
		this.name = name;
	}
	//ʵ������
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
	 //�����this����ָstudent�����s1��s2��
	 //����this����������ʵ���������췽�������־ֲ�����
}