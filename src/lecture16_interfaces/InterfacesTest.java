package lecture16_interfaces;

public class InterfacesTest {
}

interface Drawable {
    String color = "white"; // fields always public, static and final

    void draw(); // methods always public and abstract
}
interface Printable  {

    void print();
}
class Shape  {
    private int x, y;
}
class Rectangle extends Shape implements Drawable, Printable {
    private int width, height;
    public Rectangle(int x, int y, int width, int height) {

    }
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }

    @Override
    public void print() {
        System.out.println("print a rectangle");
    }

}