
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String [] ages = word.split(",");
            if(Integer.valueOf(ages[1])>oldest){
                oldest = Integer.valueOf(ages[1]);
            }
        }
        System.out.println( "Age of the oldest: " + oldest);

    }
}
