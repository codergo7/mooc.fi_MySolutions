
import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(item.getWeight() <= this.maxWeight - this.totalWeight()){
            this.items.add(item);
        }
    }
    
    public void printItems(){
                
        for (Item item : items) {
            System.out.println(item.toString());;
        }
    }    
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        int heaviest =this.items.get(0).getWeight();
        Item item1 = null;
        //String name= this.items.get(0).getName();
        for (int i =0; i<this.items.size(); i++) {
            if(this.items.get(i).getWeight()>heaviest){
                heaviest = this.items.get(i).getWeight();
                //name = this.items.get(i).getName();
                item1 = this.items.get(i);
            }
        }
        
        return item1;
        //return new Item(name,heaviest);
    }
    
    
    public int totalWeight(){
        int totalWeight=0;
        for (Item item : items) {
            totalWeight+= item.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        
        return (this.items.size()==0 ? "no" : this.items.size()) + " item" + (this.items.size()==1 ? "" : "s") + " (" + totalWeight() + " kg)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
