public class interfaceTest2 {
    public static void main(String[] args) {
     menu c = new ChineseCook();
     menu a = new AmericanCook();
     customer c1 = new customer(1,c);//这里通过传接口，来实现传递多种做法（向下转型）（多态的体现）
     customer c2 = new customer(2,a);
     c1.order();
     System.out.println("---------------------------");
     c2.order();
    }
}

