
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        File openFile = new File(file);
        Scanner reader = new Scanner(openFile);
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int counter = 0;
        while(reader.hasNextLine()){
            int number = Integer.valueOf(reader.nextLine());
            if(number<= upperBound && number>=lowerBound){
                counter++;
            }
            
        }
        System.out.println("Numbers: " + counter);
    }

}
