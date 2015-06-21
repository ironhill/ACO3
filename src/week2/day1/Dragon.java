package week2.day1;

/**
 * Created by Ihor Samanchuk on 15.06.2015.
 */
public class Dragon {
    private String name;
    private int age;
    private String color;
    private int damage;

    public Dragon(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getDamage() {
        return damage;
    }
    public void attack(){
        System.out.println("Dragon" + name + "Attacking with damage: " + damage);
    }
    //flight
    public void flight(){
        System.out.println("Dragon" + name + "Flying ");
    }
}
