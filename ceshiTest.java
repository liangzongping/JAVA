public class ceshiTest
{
	public static void main(String[] agrs)
	{
		//��һ�ֳ�ʼ�������õķ���
		/*st s = new st();
		s.a = 10;
		*/
		
		
		//�ڶ��ֳ�ʼ�������췽�����ù��췽��
		//st s = new st();
		/*public st()
		{
		this(10);
		}*/




		//�����ֳ�ʼ������������ʱ��ֱ�ӳ�ʼ��
		st s = new st(10);
		System.out.println(s.a );
	}
}
class st
{
	int a;
	public st()
	{
		
	}
	public st(int a)
	{
		this.a = a;
	}
}
