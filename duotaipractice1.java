public class duotaipractice1
{
	public static void main(String[] agrs)
	{
		musician m = new musician();
		erhu e = new erhu();
		piano p = new piano();
		violin v = new violin();
		m.playinstrument(e);
		m.playinstrument(p);
		m.playinstrument(v);
	}
}
class musician
{
	public void playinstrument(instrument i)
	{
		if(i instanceof erhu)
		{
			System.out.print("������" );
			i.makesound();
		}
		else if(i instanceof piano)
		{
			System.out.print("������" );
			i.makesound();
		}
		else
		{
			System.out.print("������" );
			i.makesound();
		}
	}
}
class instrument
{
	public void makesound()
	{
		System.out.println("������������");
	}
}
class erhu extends instrument
{
	public void makesound()
	{
		System.out.println("������������");
	}
}
class piano extends instrument
{
	public void makesound()
	{
		System.out.println("���ٷ�������");
	}
}
class violin extends instrument
{
	public void makesound()
	{
		System.out.println("С���ٷ�������");
	}
}