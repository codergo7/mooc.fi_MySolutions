
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> mapCart;
   

    public ShoppingCart() {
        this.mapCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        
        
        
        Item item = new Item(product,1,price);
        if(this.mapCart.containsKey(item.getProduct())){
            this.mapCart.get(product).increaseQuantity();
        }
        else{
            this.mapCart.put(product, item);
        }
       
    }
    
    public int priceOneProduct(String product){
        
        return mapCart.get(product).price();
    }
    
    public int price(){
        int totalPrice = 0;
        for (Item value : mapCart.values()) {
            totalPrice += (value.getQty() * value.getUnitPrice());
        }
        return totalPrice;
    }
    
    public void print(){
        int priceCart=0;
        for (Item value : this.mapCart.values()) {
            System.out.println(value.getProduct() + ": " + value.getQty());
        }
        //System.out.println("cart price: " + price());
    } 
} */

    
public class ShoppingCart {


    private List<Item> listem;


    public ShoppingCart() {
        this.listem = new ArrayList<Item>();
    }


    public void add(String product, int price) {
        Item it = new Item(product, 1, price);
        if (!this.listem.contains(it)) {
            this.listem.add(it);
        } else {
            it.increaseQuantity();
        }
    }
    
    public int priceOneProduct(String product){
        
        for (Item item : listem) {
            if(item.getProduct().equals(product)){
                return item.price();
            }
            
        }
        
        return 0;
    }


    public int price() {
        int total = 0;
        for (Item it : this.listem) {
            total += it.price();
        }
        return total;
    }


    public void print() {


        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Item item : this.listem) {
            String itemName = item.getProduct();


            if (map.containsKey(itemName)) {
                map.put(itemName, map.get(itemName) + 1);
            } else {
                map.put(itemName, 1);
            }
        }


        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}






