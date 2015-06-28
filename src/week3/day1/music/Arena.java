package week3.day1.music;

/**
 * Created by Ihor Samanchuk on 22.06.2015.
 */
public class Arena {
    public static void main(String[] args) {
        ISongWriter songWriter = new Compositor();
        String hit = songWriter.writeSong();
        ISinger singer = new Singer();
        singer.sing(hit);
    }
}
