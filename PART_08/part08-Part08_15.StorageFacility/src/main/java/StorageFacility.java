
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> hashmap;

    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.hashmap.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> list = this.hashmap.get(unit);
        list.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if(this.hashmap.containsKey(storageUnit)){
            return this.hashmap.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> list = this.hashmap.get(storageUnit);
        for (int i =0; i<list.size(); i++) {
            if(list.get(i).equals(item)){
                list.remove(i);
                break;
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        /*if(!this.hashmap.keySet().isEmpty()){
            return this.hashmap.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        }
        */
        //return this.hashmap.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> list1 = new ArrayList<>();
        
        for (String string : this.hashmap.keySet()) {
            if(!this.hashmap.get(string).isEmpty()){
                list1.add(string);
            }
        }
        return list1;
    }
}
