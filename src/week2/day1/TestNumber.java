package week2.day1;

/**
 * Created by Ihor Samanchuk on 15.06.2015.
 */
public class TestNumber {
    public static void main(String[] args) {
        MyNumber newNumber = new MyNumber(800);
        System.out.println(newNumber.asString());
        MyNumber newNumber1 = new MyNumber(10);
        newNumber1.AddNumber(newNumber);
        System.out.println(newNumber1.asString());
        if (newNumber.isSame(newNumber1)){
            System.out.println("They are equal");
        }else {
            System.out.println("They are not equal");
        }
    }
}
