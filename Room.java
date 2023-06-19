public class Room {
    private int num;
    private String type;
    private String isempty;

    public Room() {
    }

    public Room(int num, String type, String isempty) {
        this.num = num;
        this.type = type;
        this.isempty = isempty;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsempty() {
        return isempty;
    }

    public void setIsempty(String isempty) {
        this.isempty = isempty;
    }


    public String toString() {
        return "[" + num + "   " + type + "   " + isempty + "]";
    }
}
