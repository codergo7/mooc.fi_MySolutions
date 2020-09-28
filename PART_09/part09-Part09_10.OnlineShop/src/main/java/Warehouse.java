import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> mapPrice;
    private Map<String, Integer> mapStock;

    public Warehouse() {
        this.mapPrice = new HashMap<>();
        this.mapStock = new HashMap<>();
    }
    
    public Set<String> products(){
        
        return this.mapStock.keySet();
    }
    
    public int stock(String product){
        
        if(this.mapStock.containsKey(product)){
            return mapStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(!mapStock.containsKey(product)){
            return false;
        }
        
        if(mapStock.get(product)>0){
            mapStock.put(product, (mapStock.get(product)-1));
            return true;
        }
        return false;
    }
    
    public int price(String product){
        if(this.mapPrice.containsKey(product)){
            return this.mapPrice.get(product);
        }
        
        return -99;
    }
    public void addProduct(String product, int price, int stock){
        
        this.mapStock.put(product, stock);
        this.mapPrice.put(product, price);
    }
    
}
