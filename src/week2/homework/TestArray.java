package week2.homework;

/**
 * Created by Ihor Samanchuk on 28.06.2015.
 */
public class TestArray {
    public static void main(String[] args) {
        Arrays listArray = new Arrays(100);
        listArray.randomGenerate(0, 1000);
        System.out.println(listArray.toString());
        listArray.findMinMax();
    }
}
