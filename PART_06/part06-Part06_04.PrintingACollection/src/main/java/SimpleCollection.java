
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        
        String concat = "The collection " + this.name + " has " + elements.size() + " element" + (elements.size()>1 ? "s:" : ":") + "\n";
        
        for (int i =0; i<elements.size(); i++) {
            concat+= elements.get(i) + (i==elements.size()-1 ? "" : "\n");
        }
        
        return concat; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
