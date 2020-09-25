public class ProductWarehouse extends Warehouse{
    
    private String productName;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.productName = name;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return this.productName + ": " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
