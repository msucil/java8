package com.msucil.pracitce.java.methods;

/**
 * Created by msucil on 1/25/18.
 */
public class Apple {
    private String color;
    private int weight;
    private Taste taste;

    public Apple() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", taste=" + taste +
                '}';
    }
}
