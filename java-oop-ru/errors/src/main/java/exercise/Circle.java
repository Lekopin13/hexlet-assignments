package exercise;

// BEGIN
public class Circle {
    private int radius;
    private int x;
    private int y;
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Circle(Point point, int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) throw new NegativeRadiusException();
        return radius*radius*Math.PI;
    }
}
// END
