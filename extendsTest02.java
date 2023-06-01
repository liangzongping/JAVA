public class extendsTest02
{
	public static void main(String[] agrs)
	{
		cat c = new cat();
		//c.name = "小猫";
		c.move();//调用animal的方法//实际上animal已经是cat的方法了，所以这里调用的是他自己的方法
		c.jump();
	}
}
class animal
{
	String name ="老虎";
	public void move()
	{
		System.out.println(name + "正在移动");
	}
}
class cat extends animal
{
	public void jump()
	{
		System.out.println(name + "正在跳跃");
	}
}