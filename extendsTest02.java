public class extendsTest02
{
	public static void main(String[] agrs)
	{
		cat c = new cat();
		//c.name = "Сè";
		c.move();//����animal�ķ���//ʵ����animal�Ѿ���cat�ķ����ˣ�����������õ������Լ��ķ���
		c.jump();
	}
}
class animal
{
	String name ="�ϻ�";
	public void move()
	{
		System.out.println(name + "�����ƶ�");
	}
}
class cat extends animal
{
	public void jump()
	{
		System.out.println(name + "������Ծ");
	}
}