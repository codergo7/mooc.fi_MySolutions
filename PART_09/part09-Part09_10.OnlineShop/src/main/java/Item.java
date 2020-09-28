
import java.util.HashMap;
import java.util.Map;

public class Item {
    
    
    private String product;
    private int qty;
    private int unitPrice;
    
    
    public Item(String product, int qty, int unitPrice){
        
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

   

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return this.qty;
    }
    
    
    
    public int price(){
        
        return this.unitPrice * getQty();
    }
    
    public void increaseQuantity(){
        
        this.qty++;
    }

    @Override
    public String toString() {
        //return "an item that contains " + price() + " " + this.product + "s has the total price of " + this.qty * price(); //To change body of generated methods, choose Tools | Templates.
        return this.product + ": " + this.qty;
    }
    
    
    
    
}
    