
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + spaceBox() <= this.capacity) {
            this.items.add(item);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInBox(Item item) {

        for (Item item1 : items) {
            if (item.getName().equals(item1.getName())) {
                return true;
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    public int spaceBox() {
        int content = 0;
        for (Item item : items) {
            content += item.getWeight();
        }
        return content;
    }

}
