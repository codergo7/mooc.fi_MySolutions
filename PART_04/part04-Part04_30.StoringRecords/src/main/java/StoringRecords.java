/*
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) throws FileNotFoundException {
        ArrayList<Person> persons = new ArrayList<>();
        File open = new File(file);
        Scanner reader = new Scanner(open);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] params = line.split(",");
            String name = params[0];
            int age = Integer.valueOf(params[1]);
            persons.add(new Person(name, age));
            // Write here the code for reading from file
            // and printing the read records
        }
        return persons;
    }

}*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

 

public class StoringRecords {

 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

 

        System.out.println("Filename:");
        String file = scan.nextLine();

 

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

 

        }
    }

 

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner scan = new Scanner(Paths.get(file))) {
           while(scan.hasNext()){
               String row=scan.nextLine();
               String[] parts =row.split(",");
               String name=parts[0];
               int age =Integer.valueOf(parts[1]);
               persons.add(new Person(name,age));
           } 
        } catch (Exception e) {
        }
        
        return persons;

 

    }
}