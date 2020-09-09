
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            Boolean flag = true;
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            for (Book book1 : books) {
                if(book.equals(book1)){
                    flag =false;
                }
                
            }
 
            if(flag){
                books.add(book);
            }      
            
            }
            

        
        System.out.println("Thank you! Books added: " + books.size());
        // NB! Don't alter the line below!
     
    }

}