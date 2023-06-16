

/**
 * 数组是一个引用数据类型，存储在堆内存当中
 * 在java中，数组一旦建立，其长度不可改变；
 * 当数组存放的是对象时，实际上存储的是对象的内存地址；
 * 数组的定义：
 * 1.静态初始化一维数组：int[] i = {1,2,3};
 * 2.动态初始化一维数组：int[] i = new int[4];
 *
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] i = {1,2,3};
        int j;
        for(j = 0 ; j < i.length;j++)
        {
            System.out.println(i[j]);
        }
        System.out.println("=========================");
        int[] a = new int[3];
        int k;
        for(k = 0 ; k < a.length;k++)
        {
            a[k] = k+1;
            System.out.println(a[k]);
        }
        System.out.println("==========================");
        arrayprint(i);//传一个静态数组
        System.out.println("==========================");
        arrayprint(new int[]{1,2,3});//传一个静态数组的另一个办法
    }
    public static void arrayprint(int[] a)
    {
        int j;
        for(j = 0 ; j < a.length;j++)
        {
            System.out.println(a[j]);
        }
    }
}
