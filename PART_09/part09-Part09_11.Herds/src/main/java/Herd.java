
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Organism> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }

    
    
    
    
    public void addToHerd(Movable movable){
        Organism org = (Organism) movable;
        this.list.add(org);
    }
    
    
    @Override
    public void move(int dx, int dy) {
        for (Organism organism : list) {
            organism.move(dx, dy);
        }
    }
       
    @Override
    public String toString() {
        String str="";
        for (Organism movable : list) {
            str+= "x: " + movable.getX() + "; y: " + movable.getY() + "\n";
        }
        
        return str;
        //return "x: " + this.x + "; y: " + this.y; //To change body of generated methods, choose Tools | Templates.
    }
}
