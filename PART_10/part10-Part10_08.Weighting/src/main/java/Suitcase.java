
import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        int summa = 0;
        int indeksi = 0;
        while (indeksi < this.Items.size()) {
        summa += this.Items.get(indeksi).getWeight();
        indeksi++;
        }
        return summa;
    }

    public void printItems() {
        int indeksi = 0;
        while (indeksi < this.Items.size()) {
        Item t = this.Items.get(indeksi);
        System.out.println(t);
        indeksi++;
        }
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }
        
       //this.Items.stream().mapToInt(n-> n.getWeight()).sorted().collect(Collectors.toCollection(ArrayList::new));
       
        ArrayList<Integer> lst;
        lst = this.Items.stream().map(n-> n.getWeight()).sorted().collect(Collectors.toCollection(ArrayList::new));
        
       
        
                
        return this.Items.stream().filter(n-> n.getWeight() == lst.get(lst.size()-1))
               .collect(Collectors.toCollection((ArrayList::new))).get(0);
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
