package itacademy.java.oop.basics;

import java.util.Random;

public class Square {
    private double length;
    private double width;
    private final int id = new Random().nextInt(100)+1;

    public Square() {
        this.length = 0;
        this.width = 0;
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square " + id +" {" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int getId() {
        return id;
    }

    public double getPerimeter()
    {
        return 2*(this.width+ this.length);
    }
    public double getArea()
    {
        return this.width* this.length;
    }

}
