
import java.util.Scanner;

public class TextUI {
    
    private Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();
                
                this.dictionary.add(word, translation);
                
            }
            
            if(command.equals("search")){
                System.out.print("To be translated: ");
                String word = scan.nextLine();
                
                if(this.dictionary.translate(word) != null){
                    System.out.print("Translation: " + this.dictionary.translate(word));
                }
                else{
                    System.out.println("Word " + word + " was not found");
                }
                                
            }
            
            
            
            System.out.println("Unknown command");
            
        }
    }
    
}
