
import java.util.Scanner;

public class UserInterface {
    
    private TodoList listToDo;
    private Scanner scanner;

    public UserInterface(TodoList listToDo, Scanner scanner) {
        this.listToDo = listToDo;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            if(command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.listToDo.add(toAdd);
            }
            
            if(command.equals("list")){
                this.listToDo.print();
            }
            
            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                int indexRemove = Integer.valueOf(scanner.nextLine());
                this.listToDo.remove(indexRemove);
            }
            
            
            
        }
        
        
    }
    
    
    
}
