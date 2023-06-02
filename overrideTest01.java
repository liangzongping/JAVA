public class overrideTest01
{
	public static void main(String[] agrs)
	{
		cat c =new cat();
		c.move();
	}
}
class animal
{
	public void move()
	{
		System.out.println("动物在移动");
	}
}
class cat extends animal
{
	public void move()
	{
		System.out.println("猫在移动");//方法覆盖
	}
	/*public void move()
	{
		System.out.println("动物在移动");
	}*///这里相当于有这个函数

}
/*
方法覆盖的条件：
1.两个类有继承关系
2.重写后的方法和之前的方法有相同的返回值，方法名，相同的形式参数列表
3.访问权限不能更低，只能更高




*/