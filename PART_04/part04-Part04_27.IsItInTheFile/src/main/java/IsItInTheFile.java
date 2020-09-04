
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        String test = "";
        try{
        
        
        File openFile = new File(file);
        Scanner reader = new Scanner(openFile);
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        while(reader.hasNextLine()){
            test = reader.nextLine();
            if(searchedFor.equals(test)){
                break;
            }
            
        }      
        if(searchedFor.equals(test)){
                System.out.println("Found!");
            }
        else{
            System.out.println("Not found.");
        }
       
        
        
        
        }
        catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        

    }
}
