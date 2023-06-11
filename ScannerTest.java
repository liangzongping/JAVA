import java.util.Scanner;
public class ScannerTest
{
	public static void main(String[] agrs)
	{
		//这样写是因为Scanner这个类与ScannerTest这个类所在的目录不一样；故需要用全名来调用
		//java.util.Scanner s = new java.util.Scanner(System.in);
		Scanner s = new Scanner(System.in);//导入了java.util.Scanner
		int input = s.nextInt();
		System.out.println(input);
		//lang包不需要导入
//		eg:System.是lang包下的
	}
}