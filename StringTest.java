/*
String ��
1.String���Ѿ���д��equals����
2.String���Ѿ���д��toString()����;

�ܽ᣺1.java�л����������ͱȽϴ�Сʱ��Ҫʹ�� == ��
	  2.java�������������ͱȽϴ�Сʱ��Ҫʹ��  .equals()������

		
*/
public class StringTest
{
	public static void main(String[] agrs)
	{
		//ʵ����StringҲ��һ����
		String s1 = "liang";
		String s2 = new String("zong");
		String s3 = new String("ping");
		String s4 = "liang";
		System.out.println(s1);
		System.out.println(s2);
		//�Ƚ������ַ�������ʹ�� == �Ƚϣ���Ϊs2��s3��ʾ�����ڴ��ַ��
		System.out.println(s2 == s3);//false
		//�Ƚ������ַ���Ӧ��ʹ�� equals ,String���Ѿ���д��equals��
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		//String�Ѿ���д��toString();
		System.out.println(s1.toString());//liang
		System.out.println(s1);
		//������������ࣻ


	}
}