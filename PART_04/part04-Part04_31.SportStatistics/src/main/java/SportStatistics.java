
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        int games=0;
        int wins =0;
        int losses = 0;
        
        File open = new File(file);
        
        Scanner reader = new Scanner(open);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            
            String[] arr = line.split(",");
            if(team.equals(arr[0]) || team.equals(arr[1]) ){
                games++;
                if(team.equals(arr[0])&& Integer.valueOf(arr[2])> Integer.valueOf(arr[3])){
                    wins++;
                }
                
                if(team.equals(arr[1])&& Integer.valueOf(arr[3])> Integer.valueOf(arr[2])){
                    wins++;
                }
                
            }
            
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games-wins));
        

    }

}
