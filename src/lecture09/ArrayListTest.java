package lecture09;



import java.util.ArrayList;
import lecture06.Car;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>(); // angle brackets: <>
        Car c1 = new Car();

//        cars.add("abc"); // error

        System.out.println(new Car());

        ArrayList<String> alString = new ArrayList<String>();

        String s123 = new String("askldfs");
        alString.add(new String("abc"));
        alString.add(s123);

        alString.add("abc");
        alString.add("def");
        alString.add("ghi");
        alString.add("jkl");

        System.out.println(alString);
        System.out.println(alString.size());

//        alString.clear();

//       System.out.println(alString);
//        System.out.println(alString.size());

        System.out.println(alString.get(2));
        alString.set(2, "xyz"); //updating
        System.out.println(alString);

        alString.remove(2);
        System.out.println(alString);
        alString.remove("abc");
        System.out.println(alString);

        System.out.println(alString.contains("abc"));
        System.out.println(alString.contains("def"));

        System.out.println(alString.indexOf("abc"));
        System.out.println(alString.indexOf("def"));

        ArrayList<Integer> alInt = new ArrayList<Integer>(); // wrapper classes in java.lang

        Integer i1 = 3; // auto boxing

        alInt.add(i1);
        alInt.add(5); // auto boxing

        Integer i2 = alInt.get(0);
        int i3 = alInt.get(1); // auto unboxing

        // equals method

//        double [] d = {2, 3, 4, 5};
//
//        int[] i = {1, 2, 3, 4};
//
//        test(1, d);
//        test(2);
//
//        int total = 0;
//        for(String s: args)
//        {
//            total += Integer.parseInt(s);
//            System.out.println(s);
//        }
//        System.out.println(total);
//
//        Car car = new Car();
//        Car car2 = new Car();
//        System.out.println(car.getClass());
//        System.out.println(d.getClass());
//        System.out.println(i.getClass());
//        Integer i1 = 1;
//        ArrayList<Double> d1 = new ArrayList<>();
//        System.out.println(i1.getClass());
//        System.out.println(d1.getClass());
//
//        ArrayList<Double> d2 = new ArrayList<>();
//        d2.add(1.1);
//        d2.add(2.2);
//        d2.add(3.3);
//        d2.add(10.5);
//
//        System.out.println(d2.contains(2.2));
//
//        ArrayList<String> s1 = new ArrayList<>();
//
//        s1.add("abc");
//        s1.add("bcd");
//        s1.add("cde");
//        s1.add(0, "efg");
//        s1.add("def");
//
//        System.out.println(s1.indexOf("efg"));


    }

    public static void test(int x, double... y) {
        System.out.println(x);

        System.out.println(y.length);
        for (double d : y)
            System.out.println(d);

        System.out.println();
    }
}

// class Integer {
// int data;
// public Integer(int data) {
// this.data = data;
// }
// }