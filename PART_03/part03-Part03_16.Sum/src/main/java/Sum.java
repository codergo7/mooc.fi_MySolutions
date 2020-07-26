
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
       // Try your method here
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        return sum;
    }
    
            
}
