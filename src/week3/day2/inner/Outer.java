package week3.day2.inner;

/**
 * Created by Ihor Samanchuk on 23.06.2015.
 */
public class Outer {
    private int outerField;
    private static int innerField = 15;

    public class Inner {
        private int innerField;

        public void innerMethod() {
            System.out.println("In inner class . Field = " + innerField);
        }
    }

    public static class Nested {
        public void nestedMethod() {
            System.out.println(innerField);
        }
    }
}
