/*
package包机制
为什么要用包机制？
用包机制可以方便程序的管理；不同功能的类放在不同的包下

package 语法
package 包名；
eg: package com.liangzongping.javase.packageHello
注意，package 放在源代码的第一行****

包名的命名规范：
公司域名倒序 项目名 模块名 功能名
*/



/*
带有package的Java程序怎么运行
编译后生成的类名不再是packageHello
而是com.liangzongping.javase.packageHello.packageHello



编译：javac -d . packageHello.java

	-d   表示带包编译
	.   表示编译完后把文件放到当前目录
	packageHello.java  表示被编译文件

*/
package com.liangzongping.javase.packageHello;
public class packageHello
{
	public static void main(String[] agrs)
	{
		//user u = new user();

		System.out.println("helloworld!!!!");
		//System.out.println(u);

	}
}