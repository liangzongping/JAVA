public class superpractice3
{
	private int a;
	public superpractice3() {}
	public superpractice3(int a)
	{
		this.a = a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public int getA()
	{
		return a;
	}
	public static void main(String[] agrs)
	{
		java.util.Scanner s =new java.util.Scanner(System.in);
		System.out.println("������������Ĵ�С");
		int input = s.nextInt();
		superpractice3 A = new superpractice3(input);
		B b = new B(A);
		b.paiduan();
	}
}

class B
{
	private superpractice3 A;
	public B() {}
	public B(superpractice3 A) 
	{
		this.A = A;	
	}
	public void setSuperpractice3(superpractice3 A)
	{
		this.A = A;
	}
	public superpractice3 getSuperpractice3()
	{
		return A;
	}
	public void paiduan()
	{
		while(true)
		{
		java.util.Scanner s =new java.util.Scanner(System.in);
		System.out.println("���������Ĵ�С");
		int input = s.nextInt();
		if(A.getA()<input)
		{
			System.out.println("�´���,�����²�");
		}
		else if(A.getA()>input)
		{
			System.out.println("��С�ˣ������²�");
		}
		else
		{
			System.out.println("��ϲ�㣬�¶���");
			System.exit(0);
		}
		}
		
	}
	
}
