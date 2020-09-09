
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> listIde = new ArrayList<>();
        //ArrayList<String> listName = new ArrayList<>();
        
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if(identifier.isEmpty()|| name.isEmpty()){
                break;
            }
            Archive archive = new Archive(identifier,name);
            
            listIde.add(archive);
            //listName.add(name);
            
        }
        System.out.println("==Items==");
        
            for (Archive archive : listIde) {
            
        
            System.out.println(archive);
            
            }
    }*/


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

 

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

 

            if (name.isEmpty()) {
                break;
            }
            if (!list.contains(identifier)) {
                list.add(identifier);
                list.add(name);
            }

 

        }
        System.out.println("==Items==");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ": " + list.get(i + 1));
            i++;
        }
    }
}