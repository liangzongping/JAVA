import java.util.Scanner;

public class HotelSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.InitRoom();
        HotelSystem s = new HotelSystem();
        while (true) {
            System.out.println("*******欢迎来到酒店管理系统！！！*******");
            System.out.println("*******1.查看酒店情况*****************");
            System.out.println("*******2.预定房间********************");
            System.out.println("*******3.退订房间********************");
            System.out.println("*******4.退出系统********************");
            System.out.println("************************************");
            Scanner s1 = new Scanner(System.in);
            System.out.println("输入功能编号");
            int i = s1.nextInt();
            if (i == 1) {
                s.print(h.rooms);

            } else if (i == 2) {
                s.reserve(h.rooms);
                s.print(h.rooms);
            } else if (i == 3) {
                s.cancel(h.rooms);
                s.print(h.rooms);
            } else if (i == 4) {
                break;
            } else {
                System.out.println("输入编号有误，请重新输入");
            }
        }


        s.print(h.rooms);
    }






    public void print(Room[][] rooms) {
        int i;
        int j;
        for (i = 0; i < rooms.length; i++) {
            for (j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }

    public void reserve(Room[][] rooms) {
        int i;
        int j;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要预定的房间");
        int input = s.nextInt();
        if (search(rooms, input)) {
            for (i = 0; i < rooms.length; i++) {
                for (j = 0; j < rooms[i].length; j++) {
                    if (input == rooms[i][j].getNum()) {
                        if (rooms[i][j].getIsempty().equals("空闲")) {
                            rooms[i][j].setIsempty("占用");
                            break;
                        } else {
                            System.out.println("你找的房间已被占用，请重新选择");
                        }
                    }
                }
            }
        } else
            System.out.println("找不到你要的房间");
    }

    public void cancel(Room[][] rooms) {
        int i;
        int j;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要退订定的房间");
        int input = s.nextInt();
        if (search(rooms, input)) {
            for (i = 0; i < rooms.length; i++) {
                for (j = 0; j < rooms[i].length; j++) {
                    if (input == rooms[i][j].getNum()) {
                        rooms[i][j].setIsempty("空闲");
                        break;
                    }
                }
            }
        } else
            System.out.println("找不到你要的房间");
    }

    public boolean search(Room[][] rooms, int input) {
        int i;
        int j;
        for (i = 0; i < rooms.length; i++) {
            for (j = 0; j < rooms[i].length; j++) {
                if (input == rooms[i][j].getNum())
                    return true;
            }

        }
        return false;
    }
}
