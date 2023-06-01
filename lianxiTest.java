public class lianxiTest
{
	public static void main(String[] agrs)
	{
		Account a = new Account(1000,2000,"1.23%");
		customer c1 = new customer("jane.smith",a);
		c1.getAccount().withdraw(1000);
		c1.getAccount().deposit(10000);
		System.out.println(c1.getAccount().getBalance());

	}
}
class Account
{
	//账户
	private int id;
	//余额
	private int balance;
	//年利润
	private String annualInterestRate;
	//无参构造
	public Account()
	{
		this(1000,2000,"1.23%");
	}
	//有参构造
	public Account(int id,int balance,String annualInterestRate)
	{
		this.id = id; 
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	//set和get方法
	public void setId(int id)
	{
		this.id = id;
	}
	public void withdraw(int balance)
	{
		if(balance>this.balance)
		{
			System.out.println("取钱失败，你的余额为" + this.balance);
			return;
		}
		this.balance -= balance;
		System.out.println("取钱成功");
	}
	public void deposit(int balance)
	{
		this.balance += balance;
		System.out.println("存钱成功");
	}
	public void setAnnualInterestRate(String annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public int getId()
	{
		return id;
	}
	public int getBalance()
	{
		return balance;
	}
	public String getAnnualInterestRate()
	{
		return annualInterestRate;
	}

}
class customer
{
	//名字
	private String name ;
	//账户
	private Account a1;
	public customer()
	{
	}
	public customer(String name,Account a)
	{
		this.name = name;
		a1 = a;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAccount(Account a1)
	{
		this.a1 = a1;
	}
	public Account getAccount()
	{
		return a1;
	}
}