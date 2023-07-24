import java.util.ArrayList;
import java.util.Collection;
//下面程序表明Collection的contains方法调用用了equals方法；
//总结：存放在集合中的类型，一定要重写equals方法；
public class CollectionTest3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println(c.size());
        String x = new String("abc");
        System.out.println(c.contains(x));//输出true
    }
}
