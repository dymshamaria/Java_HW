package lecture.lecture7;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public boolean isValid() {
        return x > 0 && y > 0;
    }

}


