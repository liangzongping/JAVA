public class Hotel {
    Room[][] rooms = new Room[3][3];
    public void InitRoom()
    {
        int i;
        int j;
        int k = 1;
        for(i = 0;i<rooms.length;i++)
        {
            for(j = 0;j<rooms[i].length;j++)
            {
                if(i == 0)
                    rooms[i][j] = new Room(k,"单人房","空闲");
                else if(i == 1)
                    rooms[i][j] = new Room(k,"双人房","空闲");
                else
                    rooms[i][j] = new Room(k,"总统房","空闲");
                k++;
            }
        }

    }
}
