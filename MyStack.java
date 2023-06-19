public class MyStack {
    Object[] o;
    int index;

    public MyStack() {
        this.o = new Object[10];
        this.index = -1;
    }

    public void push(Object o) {

        this.index++;
        //加加后必须要判断，避免数组越界
        if (this.index >= this.o.length) {
            System.out.println("压栈失败，栈已经满了");
            return;
        }
        this.o[index] = o;
    }

    public Object pop() {
        Object i = null;
        //判断放在前面，防止出现数组越界
        if (this.index <= -1) {
            System.out.println("栈已经空了");
            return null;
        }

        i = this.o[index];
        this.o[index] = null;
        this.index--;

        return i;
    }

    public void print() {
        int i;
        for (i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
    }
}
