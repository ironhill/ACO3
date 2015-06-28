package week3.day1.music;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class Bard implements ISinger,ISongWriter {
    @Override
    public void sing(String song) {
        System.out.println("Super Bard " + song);

    }

    @Override
    public String writeSong() {
        return "Bla bla bla";
    }
}
