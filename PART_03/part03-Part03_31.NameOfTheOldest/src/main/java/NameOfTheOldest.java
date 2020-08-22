
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest=0;
        String older ="";
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String [] ages = word.split(",");
            if(Integer.valueOf(ages[1])>oldest){
                oldest = Integer.valueOf(ages[1]);
                older = ages[0];
            }
        }
        System.out.println( "AName of the oldest: " + older);


    }
}
