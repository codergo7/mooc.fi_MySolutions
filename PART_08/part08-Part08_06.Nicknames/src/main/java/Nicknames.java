
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        
        HashMap<String,String> hashMap = new HashMap<>();
              
        hashMap.put("matthew" , "matt");
        hashMap.put("michael" , "mix");
        hashMap.put("arthur" , "artie");
        
        for (String string : hashMap.keySet()) {
            System.out.println(string + "'s nickname is "+ hashMap.get(string));
        }
        
        
        // Do the operations required here!
    }

}
