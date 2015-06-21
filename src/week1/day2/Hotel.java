package week1.day2;

import week1.day1.Human;

/**
 * Created by Ihor Samanchuk on 09.06.2015.
 */
public class Hotel {
    private Human[] visitors = new Human[10];
    private int size;

    public void addVisitor(Human visitor) {
        if (size >= visitors.length) {
            System.out.println("No free rooms");
        } else {
            visitors[size] = visitor;
            size++;
        }
    }

    public void showVisitors() {
        for (int i = 0; i < size; i++) {
            System.out.println(visitors[i].asString());
        }
    }
}
