package week2.homework;

import java.util.Scanner;

/**
 * Created by Ihor Samanchuk on 28.06.2015.
 */
public class TestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input first value: ");
        double firstValue = scan.nextDouble();
        System.out.println("Please choose operation ");
        String operation = scan.next();
        char resultOperation = operation.charAt(0);
        System.out.println("Please input second value: ");
        double secondValue = scan.nextDouble();
        Calculator calc = new Calculator(firstValue, secondValue, resultOperation);
        calc.returnResult();
    }
}
