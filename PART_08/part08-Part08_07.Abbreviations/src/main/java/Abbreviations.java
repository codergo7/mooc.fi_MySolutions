
import java.util.HashMap;

public class Abbreviations {
    
    private String abbreviation;
    private String explanation;
    HashMap<String,String> hashList; 
    

    public Abbreviations() {
        this.abbreviation = abbreviation;
        this.explanation = explanation;
        this.hashList = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        if(hasAbbreviation(abbreviation)){
            System.out.println("The abbreviation is already in the list");
        }
        else{
            this.hashList.put(abbreviation, explanation);
        }
    }
    
    public String findExplanationFor(String abbreviation){
        
        if(hasAbbreviation(abbreviation)){
            return this.hashList.get(abbreviation);
        }
        else{
            return null;
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.hashList.containsKey(abbreviation)){
            return true;
        }
        
        return false;
    }
    
    /*public String sanitizedString(String abbreviation){
        if(abbreviation==null){
            return "";
        }
        
        abbreviation = abbreviation.toLowerCase();
        return abbreviation.trim();
    }*/
    
    
    

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    
    
    
}
