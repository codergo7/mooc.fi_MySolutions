
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageOfSelectedNumbers {
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> positive = numbers.stream().filter(number-> number>0).collect(Collectors.toCollection(ArrayList::new));
        
        return positive;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop. ");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int number = Integer.valueOf(input);
            numbers.add(number);          
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) ");
        String choise = scanner.nextLine();
        
        if(choise.equals("n")){
            double averag = numbers.stream().mapToInt(n-> Integer.valueOf(n)).filter(s -> s<0).average().getAsDouble();
        
        System.out.println("average of the numbers: " + averag);
        }
        
        if(choise.equals("p")){
            double averag = numbers.stream().mapToInt(n-> Integer.valueOf(n)).filter(s -> s>0).average().getAsDouble();
        
        System.out.println("average of the numbers: " + averag);
        }

    }
}
