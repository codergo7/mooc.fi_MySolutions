
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        
        Database database = new Database();

        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String nameAdd = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                Bird b = new Bird(nameAdd, nameLatin, 0);
                database.add(b);
            }

            if (input.equals("All")) {
                database.printAll();
            }

            if (input.equals("One")) {
                System.out.print("Bird? ");
                String nameOne = scanner.nextLine();
                if (database.control(nameOne)) {
                    database.printOne(nameOne);
                }

            }
            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                if (database.control(name)) {
                    database.observation(name);
                } else {
                    System.out.println("Not a bird!");
                }
            }

        }

    }

}
