
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> hashmap;
    

    public DictionaryOfManyTranslations() {
        this.hashmap = new HashMap<>();
        
    }
    
    public void add(String word, String translation){
        this.hashmap.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> completed = this.hashmap.get(word);
        completed.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(this.hashmap.containsKey(word)){
            return this.hashmap.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.hashmap.remove(word);
        
    }
    
}
