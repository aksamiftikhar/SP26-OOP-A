package Lecture20_ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        int x = 10, y = 0;
//        double res = divide(x, y);


             double res = divide(x, y);
             System.out.println(res);

    }
    public static int divide(int x, int y)
    {

            return HelperFunction(x,y);


    }
    public static int HelperFunction(int x, int y)
    {
        return x/y;
    }
}
