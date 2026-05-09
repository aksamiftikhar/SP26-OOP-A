package Lecture18_Generics;
import lecture10_MiscTopics.Car; // Fully qualified class name

public class Test {
    public static void main(String[] args)
    {
        Box<Car> b1 = new Box<>(new Car());
        Box<String> b2 = new Box("");
        String s = b2.getValue();
        System.out.println(b1);
        Pair<String, Integer> p1 = new Pair<>("Hello", 42);

    }
}

class Box<T> {

    private T value;   // T is used as a regular type

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box[" + value + "]";
    }
}


 interface Drawable {

    // All fields are implicitly: public static final
    int DEFAULT_COLOR = 0xFF0000;   // a constant

    // All abstract methods are implicitly: public abstract
    void draw();
    double getArea();

    // Default method (Java 8+) — has a body, can be overridden
    default void printInfo() {
        System.out.println("Drawing: " + this.getClass().getSimpleName());
    }


}

 class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first  = first;
        this.second = second;
    }

    public A getFirst()  { return first;  }
    public B getSecond() { return second; }
}
