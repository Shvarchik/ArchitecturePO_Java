package Homework_1.modelelements;

public class Color {
    static int counter = 0;
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }

    public Color (String name)
    {
        this.name = name;
    }

}

