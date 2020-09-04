
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        File open = new File(fileName);
        Scanner reader = new Scanner(open);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String [] arr = line.split(",");
            String name = arr[0];
            int age = Integer.valueOf(arr[1]);
            
            System.out.println( name +", age: " + age + " years");
        }

    }
}
