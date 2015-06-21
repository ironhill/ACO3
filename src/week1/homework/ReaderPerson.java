package week1.homework;

/**
 * Created by Ihor Samanchuk on 13.06.2015.
 */
public class ReaderPerson {
    private String name;
    private String sureName;
    private int idDoc;

    public void setName(String name) {
        this.name = name;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getIdDoc() {
        return idDoc;
    }

    public String toString() {
        return "ReaderPerson{" +
                "Name= " + name + '\'' +
                ", Sureame= " + sureName + '\'' +
                ", IDCard= " + idDoc +
                '}';
    }
}
