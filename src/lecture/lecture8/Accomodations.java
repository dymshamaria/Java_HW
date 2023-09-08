package lecture.lecture8;

public class Accomodations {

    Hotel[] hotels;

    public int totalCapacity() {
        int sum = 0;
        for (int i = 0; i < hotels.length; i++) {
            Hotel h = hotels[i];
            sum += h.getCapacity();
        }
        return sum;
    }

    public void printAll() {
        for (int i = 0; i < hotels.length; i++) {
            Hotel h = hotels[i];
            System.out.println("Hotel " + h.name + ": " + h.getCapacity());
        }
    }

    public Hotel findForGroup(int groupSize) {
        for (int i = 0; i < hotels.length; i++) {
            Hotel h = hotels[i];
            if (h.getCapacity() >= groupSize) {
                return h;
            }
        }
        return null;
    }
}

