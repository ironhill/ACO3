package week3.geometry;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class Rectangular extends Figure {
    private double welth;
    private double lenght;

    public Rectangular(double welth, double lenght) {
        this.welth = welth;
        this.lenght = lenght;
    }

    public double getWelth() {
        return welth;
    }

    public double getLenght() {
        return lenght;
    }

    public double square() {
        return welth * lenght;
    }

    public double perimeter() {
        return (welth + lenght) * 2 ;
    }
}
