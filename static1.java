/*
	1.static ����Ϊ��̬��
	2.����static���εĶ���������صģ��༶���.�����á�����.��ȥ���ʵ�
	3.static ���εı����Ǿ�̬������static���εķ����Ǿ�̬����
	��Ա�����ɷ�Ϊ��̬������ʵ������
*/



/*
public class static1
{
	public static void main(String[] args)
	{
		Chinese c = new Chinese(12121,"lisi","China");
		System.out.println(c.num + "\n" + c.name + "\n" + c.country);
	}
}
class Chinese
{
	int num;
	String name;
	String country;
	public Chinese()
	{

	}
	public Chinese(int a,String b,String c)
	{
		num = a;
		name = b;
		country = c;
	}
}*/
//����д�е�ѿռ䣬��Ϊ�й��˵Ĺ����϶����й���
//���Կ��԰ѹ�����һ������Ϊ��̬�������༶��ģ��洢�ڷ�������
//����ʱ��Ҫ   ����.  ����ʽȥ����
public class static1
{
	public static void main(String[] args)
	{
		Chinese c = new Chinese(12121,"lisi");
		System.out.println(c.num + "\n" + c.name + "\n" + Chinese.country);
		//System.out.println(c.country);//����û�г�������ʵ������System.out.println(c.country);��ִ��
		//��Ҫ��ôд���룬������˲�֪�����Ǿ�̬��������ʵ��������
		c = null;
		System.out.println(c.country);
	}

}
class Chinese
{
	int num;
	String name;
	static String country = "China";
	public Chinese()
	{

	}
	public Chinese(int a,String b)
	{
		num = a;
		name = b;
	}
}
