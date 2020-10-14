package One;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    //construct a default geometric object
    protected GeometricObject() {
        dateCreated = new Date();
    }

    //construct a geometric object w/ color and filled value
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    //return color
    public String getColor() {
        return color;
    }

    //Set new color

    public void setColor(String color) {
        this.color = color;
    }

    //return filled. since filled is boolean the getter is named isFilled

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled " + filled;
    }

    //abstract method getarea
    public abstract double getArea();

    //abstract method getPerimeter
    public abstract double getPerimeter();
}
