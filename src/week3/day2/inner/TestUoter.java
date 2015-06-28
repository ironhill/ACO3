package week3.day2.inner;

/**
 * Created by Ihor Samanchuk on 23.06.2015.
 */
public class TestUoter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner innerInstance = outer.new Inner();
        Outer.Nested nestedInstance = new Outer.Nested();
    }
}
