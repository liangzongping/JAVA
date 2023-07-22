public class dateTest2 {
    /**
     * System类的相关属性和方法
     * 1.System.out    out是System类的静态变量
     * 2.System.out.println()          println()方法不是System类的，是printStream类的方法；
     * 3.System.currentTimeMillis();     计算1970年1月1日00时00分00秒000毫秒到当今的毫秒总数
     * 4.System.gc();      建议启动垃圾回收器；
     * 5.System.exit(0);   退出JVM
     */
    public static void main(String[] args) {
        //获取1970年1月1日00时00分00秒000毫秒到当今的毫秒总数
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("方法执行了"+ (end-begin)+"毫秒");
    }
    public static void print()
    {
        int i;
        for(i = 1;i<1000;i++)
        {
            System.out.println(i);
        }
    }
}
