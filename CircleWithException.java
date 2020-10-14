package Two;

public class CircleWithException {
    //radius of new circle
    private double radius;

    //num of objects created
    private static int numberOfObjects = 0;

    //construct a circle with radius 1
    public CircleWithException() {
        this(1.0);
    }

    //construct circle with a specified radius
    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    //return radius
    public double getRadius() {
        return radius;
    }

    //set new radius
    public void setRadius(double newRadius)
            throws IllegalArgumentException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new IllegalArgumentException("Radius can not be negative");
        }
    }

        //return numofobjects
        public static int getNumberOfObjects() {
            return numberOfObjects;
        }

        //return area of the circle
        public double findArea() {
            return radius * radius * Math.PI;
        }
    }

