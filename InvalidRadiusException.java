package Two;

public class InvalidRadiusException extends Exception {
    private double radius;

    //construct an exception
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    //return radius

    public double getRadius() {
        return radius;
    }
}
