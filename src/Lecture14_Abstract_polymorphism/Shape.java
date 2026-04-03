package Lecture14_Abstract_polymorphism;

public abstract class Shape {
    private int x, y;
    private String  color;
    public Shape(int x, int y, String color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    // abstract method
    public abstract double getArea();

    // concrete methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String [] args)
    {
//        Shape s = new Shape(1, 1, "red");
//        s.getArea();
        Shape s = new Rectangle(1, 1, "red", 2, 3);

        int x = s.getX();
        s.setX(x+1);
        int y = s.getY();
        s.setY(y+1);

        double area = s.getArea(); // resolved at runtime according to the object stored in s
        System.out.println(area);

        s = new Circle(1, 1, "red", 2);
        area = s.getArea(); // again resolved at runtime
        System.out.println(area);


        //        System.out.println(s.getArea()); // Error: s not initialized

//        Rectangle r = new Rectangle(2, 2, "blue", 3, 4);
//        System.out.println(r.getArea());
//
//        Circle c = new Circle(2, 2, "blue", 3);
//        System.out.println(c.getArea());
    }
}
// deriving (extending) a class
// concrete class
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void myRectMethod()
    {

    }
}
class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
