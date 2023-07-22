import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名和密码");
        System.out.print("用户名："); String name = s.next();
        System.out.print("密码：");   String password = s.next();
        Userservice u =new Userservice();
        try {
            u.register(name,password);
        } catch (LengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
