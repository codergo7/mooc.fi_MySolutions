
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int lowerLimit=0;
        int upperLimit=5;
        printNumbersInRange(numbers, lowerLimit, upperLimit);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit)
            System.out.println(numbers.get(i));
        }
        
    }
}
