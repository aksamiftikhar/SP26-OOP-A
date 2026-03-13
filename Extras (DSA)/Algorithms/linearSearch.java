class linearSearch{
    // only for int and String
    
    public static int index(int[] array, int toFind){        
        for (int i  = 0; i < array.length; i++){
            if (array[i] == toFind) { return i; }
        }
        return -1; // if value not found
    }

    public static int index(String[] array, String toFind){        
        for (int i  = 0; i < array.length; i++){
            if (array[i] != null && array[i].equals(toFind)) { return i; }
        }
        return -1; 
    }
    
}