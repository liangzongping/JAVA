//ʵ������������Ҳ�Ǹ�ʱ�����������󹹽�ʱ��
public class static3
{
	{
		System.out.println("���");
	}
	public static void main(String[] agrs)
	{
		System.out.println("main begin");//main begin �ȴ�ӡ������˵��ʵ����������ִ��
		System.out.println("¬��ΰnb");
		static3 a = new static3();
		System.out.println("66666");
		a.hello();//�ȴ�ӡ ��� ��˵�����ù��췽��ǰ����ִ��ʵ��������
		a.hello("lisi");
		static3 b = new static3();
		b.hello("liang");
		static3 c = new static3();//ÿ��new ǰ���� ��� �����Ҵӡ�¬��ΰnb���͡�66666��˵��
								  //ÿ�δ�������ǰ��ִ��ʵ��������
		c.hello();
	}

	public void hello()
	{
	 System.out.println("helloworld");
	}
	public void hello(String name)
	{
	 System.out.println("helloworld6666");
	}
}


 

