public class Cylinder {
    private  double radius;
    private  double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(){
        radius = 0;
        height= 0;
    }

    public Cylinder(double r){
        radius = r;
        height = 1;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setDimensions(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double lidArea(){
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea(){
        return 2* Math.PI*radius*(radius+height);
    }

    public double volume(){
        return Math.PI * radius*radius*height;
    }

    public double circumference(){
        return 2* Math.PI * radius;
    }
}
