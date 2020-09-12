
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public String take() {
        String s = this.list.remove(this.list.size()-1);
        
         return s;
    }

    public boolean isEmpty() {

        return this.list.isEmpty();
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {

        return this.list;
    }

}
