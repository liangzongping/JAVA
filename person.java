package com.liangzongping;
import com.liangzongping.javase.packageHello.packageHello;//������Ҫ���ࣨ���������ڵ�Ŀ¼��
public class person
{
	public static void main(String[] agrs)
	{

	//��ΪҪ���õ����ڲ�ͬ��Ŀ¼������Ҫȫ����Ҳ���Ե�����Ҫ����
		com.liangzongping.javase.packageHello.packageHello h = new com.liangzongping.javase.packageHello.packageHello();
		System.out.println(h);
		System.out.println("------------------------------");
		packageHello h1 = new packageHello();
		System.out.println(h1);
	}
}