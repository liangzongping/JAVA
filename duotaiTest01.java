/*
��̬�Ļ����﷨
1.����ת�ͣ���ת�������Զ�����ת����
2.����ת�ͣ���ת�ӣ���ǿ������ת�����з��գ�����Ҫ��ǿ��ת������//ʲôʱ��ʹ�ã������������еķ���ʱ����ʹ�á�
3.����������java�����������м̳й�ϵ��*****�ص�

*/
/*��
ʲô������̬
������̬������״̬

*/
public class duotaiTest01
{
	public static void main(String[] agrs)
	{
		animal a = new animal();
		a.move();
		bird b =new bird();
		b.move();
		cat c  = new cat();
		c.move();
		System.out.println("------------------------------");
		animal a1 = new cat();
		a1.move();
		cat x  = (cat)a1;//ǿ��ת��a1,����cat��Ϳ���ʹ��catchmouse();
		x.catchmouse();

		System.out.println("------------------------------");
		
		animal a2 = new bird();
		System.out.println(a2 instanceof cat);
		if(a2 instanceof cat)//a2ʵ�����Ǹ�bird��
		{
			cat  c3 = (cat)a2;//
			c3.catchmouse();
		}
		
		/*
		����ͨ����,�����г����ˣ���Ϊa2ʵ�����Ǹ�bird�࣬������birdת��Ϊcat,������û�м̳й�ϵ�����ܽ���ת��
		Exception in thread "main" java.lang.ClassCastException: class bird cannot be 
		cast to class cat (bird and cat are in unnamed module of loader 'app')
        at duotaiTest01.main(duotaiTest01.java:32)
		*/
		//��������쳣��ת�������쳣��ClassCastException
		/*
		��ô��������쳣��ת�������أ�
		����instanceof
		1.instanceof���������н׶ζ�̬�ж�����ָ��Ķ�������
		2.instanceof���﷨��c instanceof cat//������ص���true��flase
		3.������ת��ʱһ��Ҫ��instanceof���ж�Ҫ��ת�͵�
		
		
		
		
		*/







		/*
		animal a1 ��һ�������͵����ã���new cat()��һ�������͵Ķ���
		//���־�������ת��
		*/
		/*
		java�з�Ϊ����׶κ����н׶�
		�ڱ���׶��У�����������Ϊa1��һ��animal�࣬�ڼ���﷨ʱ�������ȥanimal����move();
		����ͨ������̬�󶨳ɹ�������׶����ھ�̬�󶨣�

		�����н׶Σ�a1�ڶ��ڴ��п��ٵ���cat��������������move();��ʱ�����õ���cat���е�move();
		����������н׶ΰ󶨣������н׶����ڶ�̬�󶨣�
		*/

		//a1.catchmouse();�������벻ͨ����ԭ����a1��animal�࣬�������û��catchmouse();
		/*
		duotaiTest01.java:24: ����: �Ҳ�������
                a1.catchmouse();
                  ^
		 ����:   ���� catchmouse()
		 λ��: ����Ϊanimal�ı��� a1
			1 ������
		*/

		
		//cat c2 = new animal();
		//c2.move();
		/*
		E:\JAVAproject\day19>javac duotaiTest01.java
		duotaiTest01.java:26: ����: �����ݵ�����: animal�޷�ת��Ϊcat
                cat c2 = new animal();
                         ^
		1 ������
		*/
	}	          
}
class animal
{
	public void move()
	{
		System.out.println("�������ƶ�");
	}
}
class bird extends animal
{
	public void move()
	{
		System.out.println("����ڷ���");
	}
}
class cat extends animal
{
	public void move()
	{
		System.out.println("è����·");
	}
	public void catchmouse()
	{
		System.out.println("èץ����");
	}
}