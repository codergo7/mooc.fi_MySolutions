
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
 
            String input = scan.nextLine();
            String[] parts = input.split(" ");
 
            if (parts[0].equals("quit")) {
                break;
            }
 
            if (parts[0].equals("add")) {
                if (Integer.valueOf(parts[1]) > 100 - first) {
                    first = 100;
                } else if (Integer.valueOf(parts[1]) <= (100 - first) && Integer.valueOf(parts[1]) > 0) {
                    first += Integer.valueOf(parts[1]);
                }
            }
            if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) >= first) {
                    second = first;
                    first = 0;
                }
                else if (Integer.valueOf(parts[1]) <=  first && Integer.valueOf(parts[1]) > 0) {
                    first -= Integer.valueOf(parts[1]);
                    if(second +Integer.valueOf(parts[1]) <=100 ){
                        second += Integer.valueOf(parts[1]);
                    }
                    else{
                        second =100;
                    }
                    
                }
            }
            if (parts[0].equals("remove")) {
                if (Integer.valueOf(parts[1]) >= second) {
                    second = 0;
                    
                }
                else if (Integer.valueOf(parts[1]) <=  second && Integer.valueOf(parts[1]) > 0) {
                    second -= Integer.valueOf(parts[1]);
                }
            }
        }
 
    }
}
