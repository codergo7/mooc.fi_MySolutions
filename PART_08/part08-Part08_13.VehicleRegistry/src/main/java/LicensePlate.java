
import java.util.Objects;
import java.util.Random;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

  
    @Override
    public int hashCode() {
        
        //return Integer.valueOf(this.liNumber.substring(this.liNumber.length()-3)); //To change body of generated methods, choose Tools | Templates.
        return this.country.hashCode() + this.liNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        
        LicensePlate lp = (LicensePlate) obj;
        
        if(this.country == lp.country && this.liNumber == lp.liNumber){
            return true;
        }
        return false; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
