package week3.day1;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class IntArray {
    private int[] elements;

    public IntArray(int size) {
        elements = new int[size];
    }

    public void addToArray(int value, int index) {
        elements[index] = value;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < elements.length; i++) {
            result += elements[i] + ", ";
        }
        result += elements[elements.length - 1] + "}";
        return result;
    }

    public boolean equals(Object obj){
        return false;
    }
}
