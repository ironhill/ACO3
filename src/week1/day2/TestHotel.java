package week1.day2;

import week1.day1.Human;

/**
 * Created by Ihor Samanchuk on 09.06.2015.
 */
public class TestHotel {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel();

        Human human1 = new Human();
        human1.setName("Peter");
        human1.setAge(22);

        Human human2 = new Human();
        human2.setName("Anka");
        human2.setAge(19);

        myHotel.addVisitor(human1);
        myHotel.addVisitor(human2);

        myHotel.showVisitors();

    }
}
