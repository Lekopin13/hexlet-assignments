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
    public int compareTo() {
        if (getArea() < getArea()) {
            return 1;
        } else if (getArea() > getArea()) {
            return -1;
        } else if (getArea() == getArea()) {
            return 0;
        } return 0;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
