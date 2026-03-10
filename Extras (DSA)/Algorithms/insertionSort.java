public class insertionSort {
    // only for int and String
    // ascending order 

    public static void sort(int[] array){
        int key, j;
        
        for (int i = 1; i < array.length; i++){
            key = array[i];
            j   = i - 1;
            while (j >= 0 && key < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void sort(String[] array){
        String key; 
        int j;
        
        for (int i = 1; i < array.length; i++){
            key = array[i];
            j   = i - 1;
            while (j >= 0 && (array[j].compareTo(key) > 0)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
