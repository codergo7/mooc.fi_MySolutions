
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Which file should have its contents printed?");
        
       
        String fileName = scanner.nextLine();
        
        try (Scanner readerFile = new Scanner(Paths.get(fileName))){
            while(readerFile.hasNextLine()){
                String lineX = readerFile.nextLine();
                System.out.println(lineX);
            }
        }
        catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
    }
}
