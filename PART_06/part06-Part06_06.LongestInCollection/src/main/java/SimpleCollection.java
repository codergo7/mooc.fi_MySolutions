
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    
    public String longest(){
        if(elements.isEmpty()){
            return null;
        }
        String longest="";
        int longestLenght=0;
        for (String element : elements) {
            if(element.length()>longestLenght){
                longestLenght = element.length();
                longest = element;
            }
        }
        return longest;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

}
