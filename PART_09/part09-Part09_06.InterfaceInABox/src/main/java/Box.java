
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> pack;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.pack = new ArrayList<>();
    }

    public void add(Packable pack) {
        if (pack.weight() + weight() <= this.maxCapacity) {

            this.pack.add(pack);
        }
    }

    public double weight() {
        double balance = 0;
        if (!this.pack.isEmpty()) {
            for (Packable p : this.pack) {
                balance += p.weight();
            }
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Box: " + this.pack.size() + " items, total weight " + weight() + " kg"; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
