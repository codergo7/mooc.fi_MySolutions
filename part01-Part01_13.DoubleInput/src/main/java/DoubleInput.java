
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String y=scanner.nextLine();
        Double x=Double.valueOf(y);
        System.out.println("You gave the number "+ x );
    }
}
