
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int sum=0;
        int counter = 0;
        String longest ="";
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String [] ages = word.split(",");
            sum+= Integer.valueOf(ages[1]);
            counter++;
            if(ages[0].length()>length){
                length = ages[0].length();
                longest = ages[0];
            }
        }
        System.out.println( "Longest name: " + longest);
        System.out.println( "Average of the birth years: " + sum/(double)counter);


    }
}
