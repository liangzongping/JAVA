public class nullpointTest1
{
	public static void main(String[] agrs)
	{
		//��static �ĵ��÷���
		dosome();
		//��static �ĵ��÷������÷����ļ����Ƕ��󼶱�ģ�Ҳ����ʵ��������������Ҫ���������ö������dosome1��������
		//�������
		nullpointTest1 s = new nullpointTest1();
		s.dosome1();
		s = null;
		s.dosome1();
		/*Exception in thread "main" java.lang.NullPointerException
        at nullpointTest1.main(nullpointTest1.java:12)*/
		//˵��ʵ��������ʵ�����������ܿ�ָ�����
	}
	public static void dosome()
	{
	  System.out.println("dosome!!!!!");
	}
	public void dosome1()
	{
		System.out.println("helloworld !!!!");
	}
}
class user
{
	int age;
}