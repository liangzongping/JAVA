public class Arraypractice {
    public static void main(String[] args) {
        cat c = new cat();
        bird b = new bird();
        animal[] a = {c,b};//存放子类c , b 多态的使用；
        //调用都有的方法
        a[0].move();
        a[1].move();
        System.out.println("=======================");
        //调用子类特有的方法
        int i;
        for(i = 0 ;i < a.length;i++)
        {
            if(a[i] instanceof cat)
            {
                cat c1 = (cat)a[i];
                c1.move();
                c1.catchmouse();
            }
            else if(a[i] instanceof bird){
                bird b1 = (bird)a[i];
                b1.move();
                b1.sing();
            }
        }
    }
}
class animal{
    public void move()
    {
        System.out.println("动物在移动");
    }

}
class cat extends animal{
    public void move()
    {
        System.out.println("小猫在奔跑");
    }
    public void catchmouse()
    {
        System.out.println("小猫抓老鼠");
    }
}
class bird extends animal{
    public void move()
    {
        System.out.println("鸟儿在飞翔");
    }
    public void sing()
    {
        System.out.println("鸟儿在歌唱");
    }
}
