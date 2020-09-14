
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> list;

    public JokeManager() {
        this.list = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        if(!this.list.contains(joke)){
            this.list.add(joke);
        }
    }
    
    public String drawJoke(){
        if(this.list.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int index = rand.nextInt(this.list.size());
        
        return this.list.get(index);
    }
    
    public void printJokes(){
        for (String string : list) {
            System.out.println(string);
        }
    }
}
