
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {

    public static void main(String[] args) {
        // insert test code here
        String [] array = {"3", "1", "5", "99", "3", "12"};
        
        Arrays.sort(array);
        //System.out.println("Array int: " + Arrays.toString(array));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(99);
        list.add(3);
        list.add(12);
        
        
       sortIntegers(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
            
        }
        
        
        
    }
public static void sort(int[] array){
    
    Arrays.sort(array);
}

public static void sort(String[] array){
    
    Arrays.sort(array);
}

public static void sortIntegers(ArrayList<Integer> integers){
    Collections.sort(integers);
    
}

public static void sortStrings(ArrayList<String> strings){
    Collections.sort(strings);
    
}
}
