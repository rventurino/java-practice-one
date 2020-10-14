package Two;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(3);
            new CircleWithCustomException(-5);

        }
        catch(InvalidRadiusException e){
            System.out.println(e);
        }
        System.out.println("Number of objects created " + CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    //radius of the circle
    private double radius;

    //num of objects created
    private static int numberOfObjects = 0;

    //construct circle w radius 1
    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    //construct circle with specified radius
    public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    //set new radius
    public void setRadius (double newRadius) throws InvalidRadiusException {
        if(newRadius>= 0) {
            radius = newRadius;
        }
        else throw new InvalidRadiusException(newRadius);
    }

    //return number of objects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //return area of this circle
    public double findArea() {
        return radius * radius * Math.PI;
    }
}
