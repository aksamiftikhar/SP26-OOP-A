package lecture16_interfaces;

public class InterfacesTest {
}

interface Drawable {
    String color = "white"; // fields always public, static and final

    void draw(); // methods always public and abstract
    double getArea();
    default void test() {
        System.out.println("test in Drawable");
    }
}
interface Printable  {
    void print();
    default void test() {
        System.out.println("test in Printable");
    }
}
abstract class Shape implements Drawable {
    private int x, y;
}

// The relationship between Rectangle and Shape is an IS-A relationship
// The relationship between Rectangle and Drawable/Printable is a CAN-DO relationship
class Rectangle extends Shape implements Printable {
    private int width, height;
    public Rectangle(int x, int y, int width, int height) {

    }
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }

    @Override
    public void test()
    {

    }

    @Override
    public void print() {
        System.out.println("print a rectangle");
    }

    @Override
    public double getArea() {
        return width * height;
    }

}