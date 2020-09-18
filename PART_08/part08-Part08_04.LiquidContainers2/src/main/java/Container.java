public class Container {
    
    private int contain;
 
    public Container() {
        this.contain = contain;
    }
        
    
    public int contains(){
        
        return this.contain;
    }
    
    public void add(int amount){
        if(amount>0 && amount <= 100 -this.contain  ){
            this.contain+=amount;
        }
        else if(amount > 100 -this.contain  ){
            this.contain = 100;
        }
    }
    
    public void remove(int amount){
        if(amount>0 && amount <= this.contain){
            this.contain -= amount; 
        }
        else if(amount > this.contain){
            this.contain = 0;
        }
        
        
    }
 
    @Override
    public String toString() {
        return this.contain + "/100"; //To change body of generated methods, choose Tools | Templates.
    }
    
}