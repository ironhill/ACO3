package week3.day2.staticFinal;

/**
 * Created by Ihor Samanchuk on 23.06.2015.
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(10, 15);

        System.out.println("Distance to point: " + getLineLengght(p1, Point.ZERO_POINT));
        System.out.println("Distance to point: " + getLineLengght(p2, Point.ZERO_POINT));
    }

    public static double getLineLengght(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}
