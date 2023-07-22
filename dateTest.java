import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {
    public static void main(String[] args) throws Exception{
       //获取系统当前时间（精确到毫秒）
        Date nowtime  = new Date();
        System.out.println(nowtime);
        //SimpleDateFormat这个类专门针对日期格式化
        /**
         * 年：yyyy
         * 月：MM
         * 日： dd
         * 时：HH
         * 分：mm
         * 秒：ss
         * 毫秒：SSS
         */
        SimpleDateFormat n = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss:SSS");
        String nowtimeString  = n.format(nowtime);
        System.out.println(nowtimeString);
        //获取字符串中的日期
        String h = "2008-08-08 08:08:08";
        SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date t = j.parse(h);
        System.out.println(t);
    }
}
