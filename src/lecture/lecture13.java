package lecture;


public class lecture13 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void testSum() {

        int r1 = sum(0, 0);
        System.out.println(r1 == 0);

        int r2 = sum(5, 8);
        System.out.println(r2 == 13);

        int r3 = sum(-5, -8);
        System.out.println(r3 == 3);
    }

    public static void main(String[] args) {
        testSum();

    }
}
