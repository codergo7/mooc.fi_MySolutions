
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager joke;

    public UserInterface(JokeManager joke, Scanner scanner ) {
        this.scanner = scanner;
        this.joke = joke;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop");
            
            String input = scanner.nextLine();
            
            if(input.equals("X")){
                break;
            }
            
            if(input.equals("1")){
                System.out.println("Write the joke to be added: ");
                String addJoke = scanner.nextLine();
                this.joke.addJoke(addJoke);
            }
             
            if(input.equals("2")){
                System.out.println(this.joke.drawJoke());;
            }
            
            if(input.equals("3")){
                this.joke.printJokes();
            }
        }
        
        
    }

}
