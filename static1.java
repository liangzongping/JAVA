/*
	1.static 翻译为静态的
	2.所有static修饰的都是与类相关的，类级别的.都是用“类名.”去访问的
	3.static 修饰的变量是静态变量，static修饰的方法是静态方法
	成员变量可分为静态变量和实例变量
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
//这样写有点费空间，因为中国人的国籍肯定是中国，
//所以可以把国籍这一变量改为静态变量（类级别的，存储在方法区）
//引用时需要   类名.  的形式去访问
public class static1
{
	public static void main(String[] args)
	{
		Chinese c = new Chinese(12121,"lisi");
		System.out.println(c.num + "\n" + c.name + "\n" + Chinese.country);
		//System.out.println(c.country);//运行没有出错，这里实际上是System.out.println(c.country);在执行
		//不要这么写代码，这会让人不知道这是静态变量还是实力变量；
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
