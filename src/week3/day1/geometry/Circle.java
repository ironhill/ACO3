package week3.day1.geometry;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double square() {
        return (Math.PI * Math.pow((radius), 2)) / 2;
    }
}
