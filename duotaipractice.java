/*
��̬�����ã����ʹ������϶ȣ���ߴ������չ��
*/
public class duotaipractice
{
	public static void main(String[] agrs)
	{
		master m = new master();
		dog d = new dog();
		cat c = new cat();
		yingwu y = new yingwu(); 
		m.feed(d);
		m.feed(c);
		m.feed(y);
	}
}
class master
{
	public void feed(pet p)//����ת�ͣ�ʹ�������ഫ��ʱͳһ��Ϊ����
	{
		System.out.println("master feed");
		if(p instanceof dog)
		{
			p.eat();
		}
		else if(p instanceof cat)
		{
			p.eat();
		}
		else
			p.eat();
	}
}
class pet
{
	public void eat()
	{
		System.out.println("�����");
	}
}
class dog extends pet
{
	public void eat()
	{
		System.out.println("����");
	}
}
class cat extends pet
{
	public void eat()
	{
		System.out.println("è��");
	}
}
class yingwu extends pet
{
	public void eat()
	{
		System.out.println("���ĳ�");
	}
}