public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double permiter(){
        return 2* (length + breadth);
    }

    public double area(){
        return length * breadth;
    }

    public boolean isSquare(){
        return length == breadth;
    }
}
