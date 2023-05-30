public class person
{
	//第一步，属性私有化
	private int age ;
	//第二步:一个属性对外提供get和set的方法，外部程序只能用这两个方法访问这个属性
	//可以在set 方法中设立限制条件来保证数据的安全
	public void setAge(int nianling)//因为属性被private修饰，只能在这个类中使用，故想要在外边使用
									//可以是要调用类中的方法（构造方法，利用方法修改或返回数值）
	{
		if(nianling < 0||nianling > 150)
		{
			System.out.println("输入的年龄有误！！！！修改失败");
			return;
		}
		age = nianling;
	}
	public int getAge()		//若写了这个public static int getAge() 会报错：
							//.\person.java:19: 错误: 无法从静态上下文中引用非静态 变量 age

	{
		return age;
	}
	//这里的方法名要规范：get + 属性首字母大写 或 set + 属性首字母大写
}

