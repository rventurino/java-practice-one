package One;

public class TestGeometricObject {
    //Main
    public static void main(String[] args) {
        //create 2 geometric objects
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(5, 3);

        System.out.println("Do the two objects have the same area? " + equalArea(geometricObject1, geometricObject2));

        //display circle
        displayGeometricObject(geometricObject1);

        //display rectangle
        displayGeometricObject(geometricObject2);
    }

    //method for comparing areas of two geometric objects
    public static boolean equalArea(GeometricObject objecta, GeometricObject objectb) {
        return objecta.getArea() == objectb.getArea();
    }
        //method for displaying a geometric object
        public static void displayGeometricObject(GeometricObject object) {
            System.out.println();
            System.out.println("The area is " + object.getArea());
            System.out.println("The perimeter is " + object.getPerimeter());

        }

}
