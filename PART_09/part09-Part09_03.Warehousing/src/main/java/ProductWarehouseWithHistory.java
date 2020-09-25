
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory ch;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.setBalance(initialBalance);
        this.ch = new ChangeHistory();
        this.ch.add(initialBalance);
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() +"\n"
                + "History: " + history() + "\n"
                + "Largest amount of product: " + this.ch.maxValue() + "\n"
                + "Smallest amount of product: " + this.ch.minValue() + "\n"
                + "Average: " + this.ch.average());
    }

    public String history() {

        return this.ch.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.ch.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.getBalance()) {
            double allThatWeCan = this.getBalance();
            this.setBalance(0.0);
            this.ch.add(this.getBalance());
            return allThatWeCan;
        }
        double x = this.getBalance()-amount;
        this.setBalance(x);
        this.ch.add(this.getBalance());
        return amount;
    }

    
    /*
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        this.ch.add(this.getBalance());
        if (amount < this.getBalance()) {
            return amount;
        }
        return this.getBalance();
        
    }*/

}
