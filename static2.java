/*
1.��̬����飻
static
{
	java��䣻
}
2.�����ʱִ�У���ִ��һ�Σ�������main����ǰִ��
3.һ�㰴�����϶��µ�˳��ִ��
���ã��������ʱ��һ��ʱ��������Ա�����ڴ�ʱ��һЩ׼������
*/
/*public class static2
{
	static 
	{
		System.out.println("a");
	}
	static 
	{
		System.out.println("b");
	}
	static 
	{
		System.out.println("c");
	}
	public static void main(String [] args)
	{
		System.out.println("1");
	}
}*/
public class static2
{
	/*
	static 
	{	
		System.out.println("i=" + i );
	}
	static int i = 100;
	public static void main(String[] agrs)
	{
		System.out.println("���");
	}*/


    //�������У�
	/*static2.java:35: ����: �Ƿ�ǰ������
                System.out.println("i=" + i );
                                          ^
	1 ������*/

	
	
	
	


	
	/*
	int i = 100;//��Ϊi��ʵ���������ڶ��󴴽���ſ��ٿռ�
	static 
	{	
		System.out.println("i=" + i );//��������δ���ٵı���i��
	}
	
	public static void main(String[] agrs)
	{
		System.out.println("���");
	}
	*/


	/*E:\JAVAproject\day15>javac static2.java
	static2.java:52: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� i
                System.out.println("i=" + i );
                                          ^
	1 ������*/

}