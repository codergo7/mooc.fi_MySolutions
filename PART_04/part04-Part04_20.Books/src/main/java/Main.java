import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in)  ;
    ArrayList<Book> list = new ArrayList<>();
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        while(true){
            System.out.print("Title: ");
            String title = scan.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            
            list.add(new Book(title, pages, year));
            
        }
        
        System.out.print("What information will be printed? everything? ");
        String choise = scan.nextLine();
        
        if(choise.equals("everything")){
            for (Book book : list) {
                System.out.println(book.toString());
                
            }
        }
        if(choise.equals("name")){
            for (Book book : list) {
                System.out.println(book.getTitle());
                
            }
        }
    }
}
