/*
super ���﷨��super.��super()
super��������ʵ�������͹��췽���У�����ʹ���ھ�̬����
super���������ǿ���ʡ�Ե�
superֻ�ܳ����ڹ��췽���ĵ�һ�У�ͨ����ǰ�Ĺ��췽��ȥ���ø����еĹ��췽����Ŀ���Ǵ�����������ʱ���ȳ�ʼ�����������
*/

/*
���ۣ�1.super()��this()���ܹ��棬�����췽����һ��û��super��thisʱ��ϵͳ��Ĭ���ṩsuper();
	  2.������Ҫ���ø�����޲ι��췽��ʱ�����뱣֤������޲ι��췽�����ڣ�
	  3.����Ĺ��췽��һ����ִ�е�
*/
public class super1
{
	public static void main(String[] agrs)
	{
		 credit c = new credit();
		 System.out.println(c.id);
		 System.out.println(c.name);
		 System.out.println(c.c);
		 /*
				account���޲ι���
				credit���޲ι���
		 */
		 //˵��credit��������˸���account���޲ι���
	}
}

class account
{
	int id;
	String name;
	public account()
	{
	id = 10101;
	name = "liang";
	}
	public account(int i) 
	{
		System.out.println("account���޲ι���");
	}
	
	/*
	public account(int i) 
	{
		System.out.println("account���޲ι���");
	}
	super1.java:34: ����: �޷����� account�еĹ����� accountӦ�õ���������;
        {
        ^
	��Ҫ: int
	 �ҵ�:    û�в���
	 ԭ��: ʵ�ʲ����б����ʽ�����б��Ȳ�ͬ
	1 ������
	*/



}
class credit extends account
{
	//����Ĭ����super();
	int c ;
	public credit()
	{
		c = 6666;
		System.out.println("credit���޲ι���");
	}
	
}