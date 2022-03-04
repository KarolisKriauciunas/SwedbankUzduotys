package itacademy.java.oop.basics.task1;

public class Square extends Shape{

    private double length;

    public Square(double length) {
        this.length = length;
        this.area = this.calculateArea();
    }

    public double calculateArea()
    {
      return length*length;
    }

    public double calculatePerimeter()
    {
        return 4*length;
    }

}
