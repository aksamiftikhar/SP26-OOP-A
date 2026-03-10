package lecture08;

public class Car {
    private int model;
    private int[] yearWisePrice;

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel(2005);
        // int [] arr = new int[3];
        // arr[0] = 10000;

        // int[] arr = new int[] {10000, 8000, 5000};
        int[] arr = { 10000, 8000, 5000 };
        System.out.println(arr);

        c1.setYearWisePrice(arr);
        // System.out.println(c1.getModel());
        // testMethod(c1);
        // System.out.println(c1.getModel());
        System.out.println(c1.getYearWisePrice());
        int[] arr2 = c1.getYearWisePrice();

        // System.out.println(arr2);

        // arr2[0] = 0;
        // // testMethod2(arr2);
        // // System.out.println(arr2[0]);
        // // arr[0] = -1;
        // System.out.println(c1.getYearWisePrice()[0]);
    }

    public static void testMethod2(int[] arr) {
        arr[0] = 0;
    }

    public static void testMethod(Car c) {
        c.setModel(2025);
    }

    public Car() {
        this.yearWisePrice = new int[3];
        this.model = 2001;
    }

    public void setYearWisePrice(int[] arr4) {
        yearWisePrice = arr4;
    }

    public int[] getYearWisePrice() {
        // return yearWisePrice;
        int[] temp = new int[yearWisePrice.length];
        for (int i = 0; i < yearWisePrice.length; i++) {
            temp[i] = yearWisePrice[i];
        }
        return temp;
    }

    public Car(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int m) {
        if (m >= 1980 && m <= 2026)
            model = m;

    }

}
