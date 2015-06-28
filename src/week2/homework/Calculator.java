package week2.homework;

/**
 * Created by Ihor Samanchuk on 28.06.2015.
 */
public class Calculator {
    private double firstValue;
    private double secondValue;
    private char operation;

    public Calculator(double firstValue, double secondValue, char operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public void returnResult(){
        double result = 0;
        if (operation=='+'){
            result =  firstValue + secondValue;
        }else if(operation =='-'){
            result = firstValue - secondValue;
        }else if(operation =='/'){
            result =  firstValue / secondValue;
        }else if(operation =='*'){
            result =  firstValue* secondValue;
        }
        System.out.println("Result is: " + result);
    }
}
