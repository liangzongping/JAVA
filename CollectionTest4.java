import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//总结：集合结构一旦发生变化，迭代器一定要重新获取；
public class CollectionTest4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

/*        //这个迭代器是在集合c对象未添加元素的时候创建了
        Iterator it = c.iterator();
        //添加元素后集合c对象结构发生变化
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        //Iterator it = c.iterator();
        while(it.hasNext())
        {
            //这里的迭代器是没有元素创建的迭代器，故这里调用next();
            //发生了异常：ConcurrentModificationException
            Object o = it.next();
            System.out.println(o);
        }
*/

        //取出来应该调用迭代器的remove方法
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        Iterator i1 = c1.iterator();
        while(i1.hasNext())
        {
            Object o1 = i1.next();
            System.out.println(o1);
            i1.remove();//迭代器删除元素会更新迭代器；
            //c1.remove();//不能用集合去删除元素，
            // 因为虽然集合中的元素删除了，但迭代器没有去更新；
        }
        System.out.println(c1.size());
    }
}
