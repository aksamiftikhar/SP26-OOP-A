public class bubbleSort {
    // only for int and String
    // ascending order 
    
    public static void sort(int[] array){
        int temp, count;
        boolean swap = true;
        
        count = 0;

        while (swap){
            swap = false;
            for (int x = 0; x < array.length-1-count; x++){
                if (array[x] > array[x+1]){
                    temp       = array[x];
                    array[x]   = array[x+1];
                    array[x+1] = temp; 
                    swap = true; 
                }
            }
            count++;
        }
    }

    public static void sort(String[] array){
        int     count;
        boolean swap = true;
        String  temp;

        count = 0;

        while (swap){
            swap = false;
            for (int x = 0; x < array.length-1-count; x++){
                if (array[x].compareTo(array[x+1]) > 0){
                    temp       = array[x];
                    array[x]   = array[x+1];
                    array[x+1] = temp;
                    swap = true;
                }
            }
            count++;
        }
    }
}