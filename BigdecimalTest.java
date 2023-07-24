import java.math.BigDecimal;

public class BigdecimalTest {
    //BigDecimal属于大数据，精度极高。不属于基本数据类型，属于对象（引用数据类型）
    //专门用于财务软件中
    //你处理过财务数据吗？你会使用哪一种类型
    //千万不能说double,应该用java.math.BigDecimal
    public static void main(String[] args) {
        //这里的100是精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);
    }
}
