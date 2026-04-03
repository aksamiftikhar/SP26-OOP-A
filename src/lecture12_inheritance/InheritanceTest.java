package lecture12_inheritance;

public class InheritanceTest {
    int x, y;

    public static void main(String[] args) {
        InheritanceTest test = new InheritanceTest();

        System.out.println(test.toString());
        System.out.println(test);


    }

    @Override // annotation
    public String toString() {        return "InheritanceTest{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
