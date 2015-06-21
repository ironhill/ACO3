package week1.day1;

/**
 * Created by Ihor Samanchuk on 08.06.2015.
 */
public class Human {
    private String name;
    private long uid;
    private int age;

    public Human() {

       // name = humanName;
    }

    public String asString() {
//        String result = "Name: " + name + "Age: " + age;
//        return result;
        return "Name: " + name + ", Age: " + age + " id: " + uid;
    }

    public void setAge(int humanAge)
    {
        age = humanAge;
    }

    public void setName(String humanName)
    {
        name = humanName;
    }

    public void setUid(long humanUid)
    {
        uid = humanUid;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public long getUid()
    {
        return uid;
    }
}
