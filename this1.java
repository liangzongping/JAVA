public class this1
{
	int i = 1000;
	public static void main(String[] agrs)
	{
		//System.out.println(i);	
		//	this1.java:6: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� i
	this1 a = new this1();
	System.out.println(a.i);
	a.hello();//ʵ�������ĵ���
	hello1();
	System.out.println(a.i);
	}
	public void hello()
	{
		i++;
		System.out.println(i);//�����i�൱��this.i
	}
	public static void hello1()
	{

		this1 b = new this1();
		b.i++;
		System.out.println(b.i);
	}
	/*
	this ��һ���ؼ��֣���һ��������һ�����á�
	this ���浱ǰ����ĵ�ַ���ϸ���˵��this���ǵ�ǰ����
	˭����ʵ��������this����˭
	this �洢�ڶ��ڴ浱�ж�����ڲ�
	thisֻ������ʵ������������������static������
	��̬�����в����ڵ�ǰ����
	
	*/
}