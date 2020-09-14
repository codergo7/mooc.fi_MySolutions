
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        Scanner scan = new Scanner(System.in);
        UserInterface user = new UserInterface(register,scan);
        
        user.start();

        
        
        /*
        82
83
96
51
48
56
61  the program should give 68.1428... as the average of the points.
        
   
        16
8
-3
62
99
101
64

the program should give 49.8 as the average of the points.   
        
        
        */
    }
}
