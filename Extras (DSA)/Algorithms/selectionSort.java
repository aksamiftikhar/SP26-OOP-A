public class selectionSort {
    // only for int and String
    // ascending order
    
    public static void sort(int[] array){

        int min;
        int temp;

        for (int i = 0; i < array.length; i++){
            
            min = i;

            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min] ) { 
                    min = j; 
                }
            }
            
            temp       = array[i];
            array[i]   = array[min];
            array[min] = temp;

        }
    }

    public static void sort(String[] array){

        int min;
        String temp;

        for (int i = 0; i < array.length; i++){
            
            min = i;

            for (int j = i+1; j < array.length; j++){
                if (array[j].compareTo(array[min]) < 0) { 
                    min = j; 
                }
            }
            
            temp       = array[i];
            array[i]   = array[min];
            array[min] = temp;

        }
    }   
}
