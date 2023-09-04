package lecture;

public class lecture7 {

    public static double distance(Point point1, Point point2) {
        int deltaX = point2.x - point1.x;
        int deltaY = point2.y - point1.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void main(String[] args) {
        Point daleko = new Point(4,3);
        daleko.x=4;
        daleko.y=3;
        System.out.println(daleko.isValid());

        Point zero = new Point();
        zero.x = 0;
        zero.y = 0;
        System.out.println(zero.isValid());
        System.out.println(distance(daleko,zero));

//        Line line1 = new Line();
//        line1.p1=daleko;
//        line1.p2=zero;
//
//        System.out.println(line1.length());


        //Конструкторы
        Car Audi = new Car();
        Audi.color = "Green";
        Audi.maxSpeed = 280;
        Audi.model = "A6";
        Audi.age = 2;

        Car Bmv = new Car("M3", "Black", 3, 320);
    }
}
