package com.liangzongping.javase.packageHello;
public class user
{
	public static void main(String[] agrs)
	{
		//��ͬһ��������������ֱ��ʹ��������
		packageHello h = new packageHello();
		System.out.println(h);
		System.out.println("----------------");
		com.liangzongping.javase.packageHello.packageHello h1= new com.liangzongping.javase.packageHello.packageHello(); 
		System.out.println(h1);
	}
}