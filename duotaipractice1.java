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
			System.out.print("乐手用" );
			i.makesound();
		}
		else if(i instanceof piano)
		{
			System.out.print("乐手用" );
			i.makesound();
		}
		else
		{
			System.out.print("乐手用" );
			i.makesound();
		}
	}
}
class instrument
{
	public void makesound()
	{
		System.out.println("乐器发出声音");
	}
}
class erhu extends instrument
{
	public void makesound()
	{
		System.out.println("二胡发出声音");
	}
}
class piano extends instrument
{
	public void makesound()
	{
		System.out.println("钢琴发出声音");
	}
}
class violin extends instrument
{
	public void makesound()
	{
		System.out.println("小提琴发出声音");
	}
}