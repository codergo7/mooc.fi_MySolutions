
import java.util.ArrayList;

public class Database {
    
    //private Bird bird;
    private ArrayList<Bird> list;

    public Database() {
        
        this.list = new ArrayList<>();
    }

    public void add(Bird bird){
        list.add(bird);
    }
    
    public Boolean control(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public void observation(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                bird.setObservation(1);
            }
        }
    }
    
    public void printOne(String name){
        for (Bird bird : this.list) {
            if(bird.getName().equals(name)){
                System.out.println(bird.toString());
                
            }
            
        }
        
    }
    
    public void printAll(){
        for (Bird bird1 : list) {
            System.out.println(bird1.toString());
            
        }
    }
}
