package lecture.lecture8;

public class Hotel {

    String name;
    int singleRooms;
    int doubleRooms;

    public int getCapacity() {
        return singleRooms + doubleRooms * 2;
    }


}
