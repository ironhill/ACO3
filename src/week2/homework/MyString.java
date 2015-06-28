package week2.homework;

import java.util.Scanner;

/**
 * Created by Ihor Samanchuk on 28.06.2015.
 */
public class MyString {
    private String incomeString;
    Scanner scan = new Scanner(System.in);

    public void printString() {
        System.out.println(incomeString);
    }

    public void getIncomeString() {
        System.out.println("Input String, please");
        incomeString = scan.nextLine();
    }

    public void stringToChar() {
        char[] arrayResult = incomeString.toCharArray();
    }

    public void concatanateSrings() {
        String resultString = scan.nextLine();
        System.out.println(resultString.toUpperCase());
    }
}


