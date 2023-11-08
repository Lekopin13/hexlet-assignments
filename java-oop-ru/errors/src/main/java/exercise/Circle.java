package exercise;

// BEGIN
public class Circle {
    private int radius;
    private Point point;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.getRadius() < 0) throw new NegativeRadiusException("Radius can not be negative");
        return Math.PI*Math.pow(radius, 2);
    }
}
// END
