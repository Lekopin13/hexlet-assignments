package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home cottage2) {
        if (cottage2.getArea() < getArea()) {
            return 1;
        } else if (cottage2.getArea() > getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return String.format("%d этажный коттедж площадью %s метров", floorCount, getArea());
    }
}
// END
