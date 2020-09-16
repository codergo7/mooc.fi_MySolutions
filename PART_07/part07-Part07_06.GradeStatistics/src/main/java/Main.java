
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        start();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
   }
        
    public static void start(){
        Point point = new Point();
        Scanner scan = new Scanner(System.in);
        //int sum = 0;
        //int count=0;
        System.out.println("Enter point totals, -1 stops: ");
        while(true){
            int input = scan.nextInt();
            if(input == -1){
                break;
            }
            point.add(input);
            
        }
        //System.out.println("Point average (all): " + (double) sum/(count>0 ? count : 1));
        
        System.out.println("Point average (all): " + point.avrPoints());
        System.out.println("Point average (passing): " + point.avrPassing());
        System.out.println("Pass percentage: " + point.persantage());
        point.grade();
        
    }
}
