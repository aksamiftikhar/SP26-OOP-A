public class binarySearch {
    // only for int and String
    // array must be sorted before using

    public static int index(int[] array, int toFind){
        int low, mid, top;
        low = 0;
        top = array.length - 1;
    
        while (low <= top) {
            mid = (low + top) / 2;
            if (array[mid] == toFind) { return mid; }
            if (toFind > array[mid]) { 
                low = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        //  test
        return -1; // if value not found
    }

    public static int index(String[] array, String toFind){
        int low, mid, top;
        low = 0;
        top = array.length - 1;
    
        while (low <= top) {
            mid = (low + top) / 2;
            if (array[mid].equals(toFind)) { return mid; }
            if (array[mid].compareTo(toFind) < 0) { 
                low = mid + 1;
            } else {
                top = mid - 1;
            }
        }
        
        return -1; // if value not found
    }

}