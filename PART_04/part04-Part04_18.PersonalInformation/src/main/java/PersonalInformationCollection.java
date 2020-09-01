
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.print("First name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String surname = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(name, surname, idNumber)); 
            
        }
        System.out.println("");
        for (PersonalInformation personalInformation : infoCollection) {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }

    }
}
