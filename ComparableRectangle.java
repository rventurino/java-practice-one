package Two;

import One.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
    //construct a comparable rectangle with specific properties
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override  //Implement the compareTo method definition in comparable
    public int compareTo(ComparableRectangle o) {
        if(getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()){
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }

}
