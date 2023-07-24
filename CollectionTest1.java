import java.util.ArrayList;
import java.util.Collection;

/**
 * 关于java.util.Collection接口的常用方法。
 *1.Collection中能放什么元素？
 *没有使用“泛型”之前，Collection中可以存放Object的所有子类；
 * 使用了“泛型”之后，Collection中只能存放某种具体类型。
 * （集合中不能存储基本数据类型，也不能存储java对象，只是存储Java对象的内存地址）
 *
 *
 *
 *
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection c = new ArrayList();
        //添加元素
        c.add(new student());
        c.add(1);
        c.add("liang");
        //计算并输出元素个数
        System.out.println(c.size());
        System.out.println("===========================");
        //判断某个数是否在这个集合中
        System.out.println(c.contains(1));
        System.out.println(c.contains("liang"));
        System.out.println(c.contains(2));
        System.out.println("=================================");
        //删除集合中某个元素
        c.remove("liang");
        System.out.println(c.contains("liang"));
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println("==============================");
        //清除集合中所有的元素
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println("===============================");
        //将集合转化为数组
        c.add("a");
        c.add(100);
        c.add("c");
        c.add(new student());
        Object[] o = c.toArray();
        int i;
        for(i = 0;i<o.length;i++)
        {
            System.out.println(o[i]);
        }
    }
}
class student{

}