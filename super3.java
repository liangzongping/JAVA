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
		super3.java:14: 错误: 需要'.'
                System.out.println(super);                               ^
		1 个错误
		*/
	}
}
//说明this能单独使用，super不能单独使用。
//super不是引用，也不是保存内存地址，也不指向对象，super只是代表当前对象的父类的特征