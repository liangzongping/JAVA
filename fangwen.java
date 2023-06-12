/*
访问控制权限
1.private  私有的 只能在本类中访问
2.public 公开的  任何地方
3.protected   受保护的   只能本类，同包，子类访问
4.      默认    只能在本类同包下
public     >     protected        >          默认          >      private ;
任何位置        本类，同包，子类可以       本类 ，同包           本类

*/
package com.liang.java;
import com.liang.user1;
public class fangwen
{
	public static void main(String[] agrs)
	{
	user1 u = new user1();
	vip v = new vip();
		
		//u.id = 10;
		//u.num = 10;//在不同包的情况不行，
		//u.t = 10;//公开的，在不同包行
		//u.i = 10;//在不同包的情况不行
		//除了id不能访问，其他都能访问；
		//u.dosome();
		//System.out.println(u.num);
	}
}
