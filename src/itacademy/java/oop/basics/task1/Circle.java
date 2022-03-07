package itacademy.java.oop.basics.task1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double calculateArea() {
        return this.radius * Math.PI * Math.PI;
    }

    public double calculatePerimeter() {
        return this.radius * this.radius * Math.PI;
    }

}
