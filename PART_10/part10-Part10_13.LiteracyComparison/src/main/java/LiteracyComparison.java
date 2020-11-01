
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        /*
        try {
    // reading the "presidents.txt" file line by line
    Files.lines(Paths.get("presidents.txt"))
        // splitting the row into parts on the ";" character
        .map(row -> row.split(";"))
        // deleting the split rows that have less than two parts (we want the rows to always contain both the name and the birth year)
        .filter(parts -> parts.length >= 2)
        // creating persons from the parts
        .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
        // and finally add the persons to the list
        .forEach(person -> presidents.add(person));
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
        */
        ArrayList<Literacy> liste = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv")).map(row -> row.split(","))
            .filter(parts -> parts.length >= 2).map(parts-> new Literacy(parts[3].trim(), parts[4].trim(), parts[2].trim(), Double.valueOf(parts[5].trim())))
            .forEach(lit -> liste.add(lit));
            
                    
            Collections.sort(liste, (p1, p2) -> p1.compareTo(p2));
            
            for (Literacy literacy : liste) {
                System.out.println(literacy);
                
            }
            
            
            
            
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    
   
}
