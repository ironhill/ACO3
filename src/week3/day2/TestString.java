package week3.day2;

/**
 * Created by Ihor Samanchuk on 23.06.2015.
 */
public class TestString {
    public static void main(String[] args) {
        String s = "test";
        s = s + "!";
        System.out.println(s);

//        String result = "";
//        for (int i = 0; i <100000 ; i++) {
//            result+=i;
//        }
//        System.out.println(result);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <10000000 ; i++) {
            builder.append(i);
        }
        String builderResult = builder.toString();
        System.out.println(builderResult);
       // System.out.println(builder);
    }
}
