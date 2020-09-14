
import java.util.ArrayList;

public class Hold {

private int maxWeight;
private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()<= this.maxWeight - this.totalWeight())
        this.suitcases.add(suitcase);
    }
    
    public int totalWeight(){
        int totalWeight=0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight+= suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems(){
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
            
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() +" kg)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
