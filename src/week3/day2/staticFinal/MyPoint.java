package week3.day2.staticFinal;

/**
 * Created by Ihor Samanchuk on 23.06.2015.
 */
public class MyPoint extends Point {
    public MyPoint(int x, int y) {
        super(x, y);
    }
    public int getX(){
        return getY();
    }
}
