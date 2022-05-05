public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*3.14;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
