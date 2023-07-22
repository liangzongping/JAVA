import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest1 {
    public static void main(String[] args) {
        //获取系统当前时间
        Date t = new Date();
        //格式化时间
        SimpleDateFormat n = new SimpleDateFormat("yyyy年MM月dd日   HH时mm分ss秒");
        String gt = n.format(t);
        System.out.println(gt);

    }
}
