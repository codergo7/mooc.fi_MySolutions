
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        String y=scanner.nextLine();
        int x=Integer.valueOf(y);
        System.out.println("You gave the number "+ x );

    }
}
