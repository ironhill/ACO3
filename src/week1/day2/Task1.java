package week1.day2;

import week1.day1.Human;

import java.util.Scanner;

/**
 * Created by Ihor Samanchuk on 09.06.2015.
 */
public class Task1 {
    public static void main(String[] args) {

        Human human = new Human();
        Scanner sc = new Scanner(System.in);

        System.out.println("Your age: ");
        int personAge = sc.nextInt();
        System.out.println("Your name: ");
        String personName = sc.next();

        human.setName(personName);
        human.setAge(personAge);
        sellAlcohol(human);
    }

    public static void sellAlcohol(Human human) {
        if (human.getAge() >= 21) {
            System.out.println("Take the drink " + human.getName());
        } else {
            System.out.println("Good buy " + human.getName() + " Your age is: " + human.getAge() + " and this is less then 21");
        }
    }
}

