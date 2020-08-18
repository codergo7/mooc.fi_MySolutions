
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();


            if (word.equals("")) {
                break;
            }
            
            String[] pieces = word.split(" ");
            if(word.length()>0){
                for (int i = 0; i < pieces.length; i++) {
                    System.out.println(pieces[i]);
                } 
            }
        }
        
        //int number = Integer.valueOf(scanner.nextLine());
        //if(number>0){
          //  for(int i=0; i<= number; i++)
            //    System.out.println(i);
       // }
        


    }
}
