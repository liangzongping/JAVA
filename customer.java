public class customer {
    private int num;
    private menu m;

    public customer() {
    }

    public customer(int num, menu m) {
        this.num = num;
        this.m = m;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public menu getM() {
        return m;
    }

    public void setM(menu m) {
        this.m = m;
    }

    public void order()
    {
        System.out.print(num + "号顾客吃");
        m.hongshaoniurou();
        System.out.print(num + "号顾客吃");
        m.xihongshijidan();
    }
}
