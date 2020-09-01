
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainProgram {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        System.out.println("Enter numbers: ");
        
        while(true){
            
            int a = scan.nextInt();
            if(a==-1){
                break;
            }
            if(a%2==0){
                even.addNumber(a);
            }
            else{
               odd.addNumber(a);
            }
            statistics.addNumber(a);
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
        /*Your program must use Statistics type variables for calculating the sums of total, even, and odd numbers!
         The program must create the objects in the following order: 
         first, the object that tracks the total sum, 
         second, the object that tracks the sum of even numbers, 
         and finally the object that tracks the sum of odd numbers.
         NB: don't add anything else than user-inputted numbers to the Statistics objects
         number -1 is used as the ending chanracter, and it should not be added to the statistics objects!
         error occured with user input "2 - 1"
         more information about the error: java.lang.AssertionError: 
         Unexpected method call Statistics.addNumber(3 (int)):*/
        
        /*
        System.out.println("Enter numbers: ");
        while(true){
            
            int a = scan.nextInt();
            if(a==-1){
                break;
            }
            
            statistics.addNumber(a);
        }
        System.out.println("Sum: " + statistics.sum() );
        
        /*
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        
        */
    }
}
    

