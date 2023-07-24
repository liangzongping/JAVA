import java.text.DecimalFormat;

/**
 * 数字格式有哪些
 * #     任意数字
 * ,     千分位
 * .     小数点
 *
 */
public class decimalFormat {
    public static void main(String[] args) {
        DecimalFormat h = new DecimalFormat("#,###.0000");
        String n = h.format(1234.56);
        System.out.println(n);
        DecimalFormat h1 = new DecimalFormat("###,###.###");
        String k = h1.format(123465798);
        System.out.println(k);
    }
}
