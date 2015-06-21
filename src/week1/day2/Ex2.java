package week1.day2;

import week1.day1.Human;

/**
 * Created by Ihor Samanchuk on 09.06.2015.
 */
public class Ex2 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Ihor");
        human.setAge(35);
        human.setUid(31415926100500L);
        System.out.println(human.asString());
    }
}
