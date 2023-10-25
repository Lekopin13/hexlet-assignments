package exercise;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;
    public Segment (Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Point getBeginPoint() {
        if (point1.getX() > point2.getX() && point1.getY() > point2.getY()) {
            return point2;
        } else return point1;
    }

    public Point getEndPoint() {
        if (point1.getX() > point2.getX() && point1.getY() > point2.getY()) {
            return point1;
        } else return point2;
    }

    public Point getMidPoint() {
        Point point3 = new Point((point1.getX() + point2.getX())/2, (point1.getY() + point2.getY())/2);
        return point3;
    }
}
// END
