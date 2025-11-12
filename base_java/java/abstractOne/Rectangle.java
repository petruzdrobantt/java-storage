package abstractOne;

public class Rectangle extends Shape{
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
