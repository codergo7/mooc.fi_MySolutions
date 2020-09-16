
import java.util.ArrayList;

public class Point {
    
    private ArrayList<Integer> points;

    public Point() {
        this.points = new ArrayList<>();
    }
    public double persantage(){
        int count=0;
        if(this.points.size()>0){
            for (Integer point : points) {
                if(point>=50){
                    count++;
                }
            } 
        } 
        double avr = 100.0*count/(this.points.size());
        return avr;
    }
            
    public String gradeStar(int number){
        String star = "";
        if(number>0){
        for(int i =0; i<number; i++){
            star= star + "*";
        }
        }
        return star;
    }
    
    public void grade(){
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for (Integer point : points) {
           if(point<50){
               zero++;
           }
           else if(point <60){
               one++;
           }
           else if(point<70){
               two++;
           }
           else if(point < 80){
               three++;
           }
           else if(point < 90){
               four++;
           }
           else{
               five++;
           }
        }
        System.out.println("Grade distribution: " + "\n5: " + gradeStar(five) + "\n4: " + gradeStar(four) 
                + "\n3: " + gradeStar(three) +  "\n2: " + gradeStar(two) +  "\n1: " + gradeStar(one) 
                + "\n0: " + gradeStar(zero));
    }
    
    public void add(int point){
        if(point>=0 && point <= 100){
            this.points.add(point);
        }
        
    }
    
    public double avrPassing(){
        double avr = 0.0;
        int count=0;
        if(this.points.size()>0){
            for (Integer point : points) {
                if(point>=50){
                    avr+=point;
                    count++;
                }
                
            }
            avr= (double)avr/count;
        }
       return avr;
        
    }
    
    public double avrPoints(){
        double avr = 0.0;
        if(this.points.size()>0){
            for (Integer point : points) {
                avr+=point;
                
            }
            avr= (double)avr/this.points.size();
        }
       return avr; 
    }
    
    
}
