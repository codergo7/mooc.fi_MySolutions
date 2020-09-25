
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double average(){
        double sum =0;
        for (Double double1 : this.history) {
            sum+= double1;
        
        }
        return sum/this.history.size();
    }
    
    public double minValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        Double minVal = this.history.get(0);
        for (Double double1 : this.history) {
            if(double1<minVal){
                minVal = double1;
            }
        }
        return minVal;
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0.0;
        }
        Double maxVal = this.history.get(0);
        for (Double double1 : this.history) {
            if(double1>maxVal){
                maxVal = double1;
            }
        }
        return maxVal;
    }

    @Override
    public String toString() {
        String content ="";
        for (Double n : this.history) {
            content = content + (content.equals("") ? "" : ", ") + n;
        }
        return "[" + content + "]";
 
    }
    
    
            
}
