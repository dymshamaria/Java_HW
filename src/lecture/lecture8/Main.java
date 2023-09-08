package lecture.lecture8;

public class Main {

    public static void main(String[] args) {
        Hotel tourist = new Hotel();
        tourist.name = "Турист";
        tourist.singleRooms = 10;
        tourist.doubleRooms = 30;

        System.out.println(tourist.name + ": " + tourist.getCapacity());

        Hotel hilton = new Hotel();
        hilton.name = "Hilton";
        hilton.singleRooms = 100;
        hilton.doubleRooms = 100;

        System.out.println(hilton.name + ": " + tourist.getCapacity());

        Hotel[] allHotels = new Hotel[]{tourist, hilton};

        Accomodations acc = new Accomodations();
        acc.hotels = allHotels;

        System.out.println(acc.totalCapacity());



    }
}
