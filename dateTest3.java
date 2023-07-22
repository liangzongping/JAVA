import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest3 {
    public static void main(String[] args) {
        //获取昨天这个时候的时间；
        Date t = new Date(System.currentTimeMillis()-1000*60*60*24);
        //这里面的参数是到1970年的总毫秒数；
        SimpleDateFormat n = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String t1 =n.format(t);
        System.out.println(t1);
    }
}
