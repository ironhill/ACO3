package week2.day1;

/**
 * Created by Ihor Samanchuk on 15.06.2015.
 */
public class MyNumber {
    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public void AddNumber(MyNumber number) {
        value = value + number.value;
    }

    public String asString() {
        return value + "";
    }

    public boolean isSame(MyNumber incomeValue){
        return value == incomeValue.value;
    }
}
