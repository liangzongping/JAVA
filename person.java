package com.liangzongping;
import com.liangzongping.javase.packageHello.packageHello;//导入需要的类（不是类所在的目录）
public class person
{
	public static void main(String[] agrs)
	{

	//因为要调用的类在不同的目录，故需要全名，也可以导入需要的类
		com.liangzongping.javase.packageHello.packageHello h = new com.liangzongping.javase.packageHello.packageHello();
		System.out.println(h);
		System.out.println("------------------------------");
		packageHello h1 = new packageHello();
		System.out.println(h1);
	}
}