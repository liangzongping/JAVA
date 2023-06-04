/*
多态的作用，降低代码的耦合度，提高代码的扩展力
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
	public void feed(pet p)//向下转型，使多种子类传参时统一变为父类
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
		System.out.println("宠物吃");
	}
}
class dog extends pet
{
	public void eat()
	{
		System.out.println("狗吃");
	}
}
class cat extends pet
{
	public void eat()
	{
		System.out.println("猫吃");
	}
}
class yingwu extends pet
{
	public void eat()
	{
		System.out.println("鹦鹉吃");
	}
}