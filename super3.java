public class super3
{
	public static void main(String[] agrs)
	{
		T t = new T();
		t.dosome();
	}
}
class T
{
	public void dosome()
	{
		System.out.println(this);
		//System.out.println(super);
		/*
		super3.java:14: ����: ��Ҫ'.'
                System.out.println(super);                               ^
		1 ������
		*/
	}
}
//˵��this�ܵ���ʹ�ã�super���ܵ���ʹ�á�
//super�������ã�Ҳ���Ǳ����ڴ��ַ��Ҳ��ָ�����superֻ�Ǵ���ǰ����ĸ��������