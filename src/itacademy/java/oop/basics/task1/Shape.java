package itacademy.java.oop.basics.task1;

public abstract class Shape {
    protected double area;

    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    public String toString() {
        return "Shape area: " + this.calculateArea() + ", Parameter: " + this.calculatePerimeter();
    }
}
