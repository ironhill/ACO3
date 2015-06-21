package week2.day1;

/**
 * Created by Ihor Samanchuk on 15.06.2015.
 */
public class TestDagon {
    public static void main(String[] args) {
        Dragon greenDragon = new Dragon(" Greenny ", 300, " Green ");
        greenDragon.flight();
        greenDragon.setDamage(300);
        greenDragon.attack();
    }
}
