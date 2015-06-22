package week3.geometry;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class TeamGeom {
    public static void main(String[] args) {

        Circle circule = new Circle(4);
        System.out.println(FigureHelper.square(circule));
        Rectangular rectangular = new Rectangular(2,5);
        System.out.println(FigureHelper.square(rectangular));
        Figure figure = new Circle(3);
        figure.square();
        Triange triange = new Triange();
        System.out.println(FigureHelper.square(triange));
    }
}
