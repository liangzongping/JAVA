/**
 * main是由jvm调用的，main()中的参数是由jvm传进来的
 * main中数组String[] args 的
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int w;
        for(w = 0;w<args.length;w++)
        {
            System.out.println(args[w]);
        }
        System.out.println("Jvm中的args的长度" + args.length);
        //下面表示数组创建了，但数组里边没有元素；
        String[] i = new String[0];
        String[] j = {};
        printarray(i);
        printarray(j);
    }
    public static void printarray(String[] args)
    {
        System.out.println(args.length);
    }
}
