/*
String 类
1.String类已经重写了equals方法
2.String类已经重写了toString()方法;

总结：1.java中基本数据类型比较大小时需要使用 == ；
	  2.java中引用数据类型比较大小时需要使用  .equals()方法；

		
*/
public class StringTest
{
	public static void main(String[] agrs)
	{
		//实际上String也是一个类
		String s1 = "liang";
		String s2 = new String("zong");
		String s3 = new String("ping");
		String s4 = "liang";
		System.out.println(s1);
		System.out.println(s2);
		//比较两个字符串不能使用 == 比较，因为s2和s3表示两个内存地址；
		System.out.println(s2 == s3);//false
		//比较两个字符串应该使用 equals ,String类已经重写了equals、
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		//String已经重写了toString();
		System.out.println(s1.toString());//liang
		System.out.println(s1);
		//上面两条语句差不多；


	}
}