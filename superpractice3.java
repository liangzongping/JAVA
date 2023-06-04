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
		System.out.println("请设置这个数的大小");
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
		System.out.println("请猜这个数的大小");
		int input = s.nextInt();
		if(A.getA()<input)
		{
			System.out.println("猜大了,请重新猜");
		}
		else if(A.getA()>input)
		{
			System.out.println("猜小了，请重新猜");
		}
		else
		{
			System.out.println("恭喜你，猜对了");
			System.exit(0);
		}
		}
		
	}
	
}
