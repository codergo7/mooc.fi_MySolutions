
public class Statistics {
    
    //private int number;
    private int count;
    private int sum;
    //private double average;

    //public Statistics(int number) {
      //  this.number = number;
    //}
    
    
    
    
    public void addNumber(int number){
        count++;
        sum+=number;
    }

    public int getCount() {
        return count;
    }
    
    public int sum(){
        return sum;
    }
    
    public double average(){
        if(count>0){
            return (double)sum/count;
        }
            return 0;
    }
    
    
}
