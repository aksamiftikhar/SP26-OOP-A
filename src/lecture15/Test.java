package lecture15;

abstract class Shape {
    abstract double area();
    abstract public void draw();

    public void draw(int a) {

    }
    public void someGeneralMethod() {
    }
}
 class Square extends Shape {
    int side = 4;
    double area() { return side * side; }
    final void printSquare()
    {
        System.out.println("Inside Square with side  " + side);
    }
    public void draw()
    {
        System.out.println("Drawing InsideSquare  with side  " + side);
    }
}
//class SquareExt extends String {
//    @Override
//    public void printSquare()
//    {
//
//    }
//}
class Rectangle extends Shape {
    int side1 = 2;
    int side2 = 3;
    double area() { return side1 * side2; }
    void printRectangle()
    {
        System.out.println("Inside Rectangle with side  " + side1 + ", " + side2);
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing InsideRectangle with sides  " + side1 + ", " + side2);
    }
}


public class Test {
    public static void doSomething(Shape s) // again polymorphic processing of this Shape parameter
    {
        s.draw();
        s.someGeneralMethod();
    }




    public static void main(String[] args) {
        Shape s = new Square();

        Square sq = (Square) s;
        if(s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            r.printRectangle();
        }
        sq.printSquare();
        System.out.println(s.area());

        Square sq2 = new Square();
        Rectangle r2 = new Rectangle();

        doSomething(sq2);
        doSomething(r2);
    }
}
