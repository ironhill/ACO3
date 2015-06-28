package week2.homework;

import org.omg.CORBA.*;

/**
 * Created by Ihor Samanchuk on 21.06.2015.
 */
public class Arrays {

    private int[] elements;

    private static final int INT_ARRAY_DEFAULT_VALUE = 10;

    public Arrays() {
        elements = new int[INT_ARRAY_DEFAULT_VALUE];
    }

    public Arrays(int size) {
        elements = new int[size];
    }

    public void addToArray(int value, int index) {
        elements[index] = value;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < elements.length - 1; i++) {
            result += elements[i] + ", ";
        }
        result += elements[elements.length - 1] + "}";
        return result;
    }

    public void randomGenerate(int maxValue, int minValue) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int) (minValue + (Math.random() * (maxValue - minValue)));
        }
    }

    public void findMinMax() {
        int min = elements[0];
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            } else if (elements[i] > max) {
                max = elements[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}