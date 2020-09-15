
import java.util.Scanner;

public class LiquidContainers2 {

    public static void start(Container first, Container second){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            
            String[] parts = input.split(" ");
            
            int amount = Integer.valueOf(parts[1]);

            

            if (parts[0].equals("add")) {
                first.add(amount);
                }
            
            if (parts[0].equals("move")) {
                
                
                if(amount<=first.contains()){
                    second.add(amount);
                }
                else if (amount>first.contains()){
                    second.add(first.contains());
                    
                }
                
                first.remove(amount);
            }
            if (parts[0].equals("remove")) {
                second.remove(amount);
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
    
        start(first,second);
        
        
    }
}