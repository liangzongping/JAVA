public class overrideTest01
{
	public static void main(String[] agrs)
	{
		cat c =new cat();
		c.move();
	}
}
class animal
{
	public void move()
	{
		System.out.println("�������ƶ�");
	}
}
class cat extends animal
{
	public void move()
	{
		System.out.println("è���ƶ�");//��������
	}
	/*public void move()
	{
		System.out.println("�������ƶ�");
	}*///�����൱�����������

}
/*
�������ǵ�������
1.�������м̳й�ϵ
2.��д��ķ�����֮ǰ�ķ�������ͬ�ķ���ֵ������������ͬ����ʽ�����б�
3.����Ȩ�޲��ܸ��ͣ�ֻ�ܸ���




*/