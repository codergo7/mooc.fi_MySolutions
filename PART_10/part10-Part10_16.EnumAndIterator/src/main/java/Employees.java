
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd){
        for (Person person : peopleToAdd) {
            this.employees.add(person);
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            
            if(iterator.next().getEducation() == education)
               iterator.remove();
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person nextLine = iterator.next();
            if(nextLine.getEducation() == education)
                System.out.println(nextLine);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()){
            Person nextLine = iterator.next();
            System.out.println(nextLine);
        }
    }
    
    
}
