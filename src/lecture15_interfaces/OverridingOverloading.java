package lecture15_interfaces;

class Calculator {
    int add(int a, int b) {
        System.out.println("Parent int version");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println("Parent double version");
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Child int version");
        return a + b + 10;
    }
}

public class OverridingOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1,2);
        calc.add(2,3);
        
        Calculator c = new AdvancedCalculator();

        c.add(5, 3);      // Case 1: method overloading + overriding (compile-time + run-time polymorphsim)
        c.add(2.5, 3.5);  // Case 2: method overloading only (compile-time polymorphsim)
    }
}