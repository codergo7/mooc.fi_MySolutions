
import java.util.ArrayList;
import java.util.List;

public class OneItemBox extends Box {
    
    private List<Item> oneItem;

 

    public OneItemBox() {
        this.oneItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneItem.isEmpty()) {
            this.oneItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
         if (!this.oneItem.isEmpty()) {
            return this.oneItem.get(0).getName().equals(item.getName());
        }else{
            return false;
        }
    }
    
    
    
}
