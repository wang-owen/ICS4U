public class Triangle extends Shape{
    private double l1, l2, l3;

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double area() {
        return l1 * l3 / 2;
    }

    public double perimeter() {
        return l1 + l2 + l3;
    }
}
