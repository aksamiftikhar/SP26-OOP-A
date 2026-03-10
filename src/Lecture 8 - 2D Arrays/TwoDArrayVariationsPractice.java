public class TwoDArrayVariationsPractice {

    public static void main(String[] args) {

        // ======================================================
        // 1. BASIC DECLARATION (Only reference declared)
        // ======================================================

        int[][] marks;
        double[][] temperatures;
        char[][] grid;
        boolean[][] flags;

        // Memory not allocated yet



        // ======================================================
        // 2. DECLARATION + MEMORY ALLOCATION
        // Creates rectangular 2D arrays with default values
        // ======================================================

        int[][] matrix1 = new int[3][4];
        double[][] prices = new double[2][5];
        char[][] board = new char[4][4];
        boolean[][] attendance = new boolean[5][7];



        // ======================================================
        // 3. DECLARE FIRST, ALLOCATE LATER
        // ======================================================

        int[][] matrix2;
        matrix2 = new int[3][3];

        boolean[][] status;
        status = new boolean[2][4];



        // ======================================================
        // 4. INLINE INITIALIZATION (VALUES PROVIDED DIRECTLY)
        // ======================================================

        int[][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        double[][] temps = {
                {36.5, 37.0},
                {35.8, 36.2}
        };



        // ======================================================
        // 5. USING "new" WITH INITIALIZATION
        // ======================================================

        int[][] table = new int[][] {
                {10,20,30},
                {40,50,60}
        };

        boolean[][] seats = new boolean[][] {
                {true,false,true},
                {false,true,false}
        };



        // ======================================================
        // 6. JAGGED (IRREGULAR) 2D ARRAYS
        // Each row can have different number of columns
        // ======================================================

        int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        jagged[0][0] = 10;
        jagged[0][1] = 20;



        // ======================================================
        // 7. JAGGED ARRAY WITH DIRECT INITIALIZATION
        // ======================================================

        int[][] data = {
                {1,2},
                {3,4,5},
                {6}
        };

        double[][] values = {
                {1.5,2.5},
                {3.5},
                {4.5,5.5,6.5}
        };



        // ======================================================
        // 8. DECLARING ROWS FIRST, COLUMNS LATER
        // ======================================================

        int[][] scores = new int[3][];

        scores[0] = new int[5];
        scores[1] = new int[3];
        scores[2] = new int[4];



        // ======================================================
        // 9. USING CONSTANTS FOR ARRAY DIMENSIONS
        // ======================================================

        final int ROWS = 3;
        final int COLS = 4;

        int[][] matrix3 = new int[ROWS][COLS];



        // ======================================================
        // 10. PARTIAL INITIALIZATION
        // Only some elements assigned
        // ======================================================

        int[][] board2 = new int[3][3];

        board2[0][0] = 5;
        board2[1][2] = 9;
        board2[2][1] = 7;



        // ======================================================
        // 11. DIFFERENT PRIMITIVE TYPES
        // ======================================================

        // int array
        int[][] ages = {
                {18,19,20},
                {21,22,23}
        };
        int numCols = ages[0].length;
        for(int i=0;i<ages.length;i++){
            for(int j=0;j<ages[i].length;j++){
                ages[i][j] = ages[i][j]+1;
            }
        }
        // double array
        double[][] salaries = {
                {45000.5, 47000.0},
                {52000.75, 61000.25}
        };

        // char array
        char[][] ticTacToe = {
                {'X','O','X'},
                {'O','X','O'},
                {'X','O','X'}
        };

        // boolean array
        boolean[][] reservedSeats = {
                {true,false,true},
                {false,false,true}
        };



        // ======================================================
        // 12. ALTERNATIVE BRACKET STYLE
        // ======================================================

        int matrix4[][];
        double values2[][];



        // ======================================================
        // 13. MIXED PRACTICE EXAMPLES
        // ======================================================

        int[][] arr1 = new int[3][3];

        int[][] arr2 = {
                {1,2},
                {3,4}
        };

        int[][] arr3 = new int[][] {
                {5,6,7},
                {8,9,10}
        };

        int[][] arr4 = new int[2][];
        arr4[0] = new int[3];
        arr4[1] = new int[5];

        /// ///////////////////////////////////////////////////
        // PART II: Arrays of Reference types
        /// //////////////////////////////////////////////////

        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                arr4[i][j] = arr4[i][j]+1;
            }
        }
    }
}
class Student {
    private String name;
    private double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
