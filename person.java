public class person
{
	//��һ��������˽�л�
	private int age ;
	//�ڶ���:һ�����Զ����ṩget��set�ķ������ⲿ����ֻ�������������������������
	//������set ����������������������֤���ݵİ�ȫ
	public void setAge(int nianling)//��Ϊ���Ա�private���Σ�ֻ�����������ʹ�ã�����Ҫ�����ʹ��
									//������Ҫ�������еķ��������췽�������÷����޸Ļ򷵻���ֵ��
	{
		if(nianling < 0||nianling > 150)
		{
			System.out.println("������������󣡣������޸�ʧ��");
			return;
		}
		age = nianling;
	}
	public int getAge()		//��д�����public static int getAge() �ᱨ��
							//.\person.java:19: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� age

	{
		return age;
	}
	//����ķ�����Ҫ�淶��get + ��������ĸ��д �� set + ��������ĸ��д
}

