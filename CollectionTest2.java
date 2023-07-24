import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java中的集合遍历/迭代
 * 下面的遍历/迭代方式是所有的Collection和他的子类所通用的
 * 在Map集合中不能使用，在所有的Collection和他的子类适用；
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList<>();
        //添加元素
        c.add(new user());
        c.add(2);
        c.add("zong");
        c.add(100);
        c.add("ping");
        //对集合中的元素进行遍历
        //第一步：获取集合对象的迭代器对象Iterator;
        Iterator it = c.iterator();
        //第二步：通过迭代器对象中的方法来进行遍历；
        while(it.hasNext())
        {
            //获取集合中的元素
            Object o = it.next();
            System.out.println(o);
        }
    }
}
class user{

}