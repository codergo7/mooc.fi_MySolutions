import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable <Hand>{
    
    private List<Card> list;

    public Hand() {
        this.list = new ArrayList<>();
    }
    
    public void add(Card card){
        this.list.add(card);
   }
    
    public void sortBySuit(){
        Collections.sort(list, new BySuitInValueOrder());
        Collections.sort(list, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }
    
    public void sort(){
        Comparator<Card> comparator = Comparator.comparing(Card::getValue).thenComparing(Card::getSuit);
        
        Collections.sort(list, comparator);
    }
    
    public void print(){
        for (Card card : list) {
            System.out.println(card);
        }
    }

    @Override
    public int compareTo(Hand other) {
        
        int sumThis = 0;
        int sumOther = 0;
        for (Card card : this.list) {
            sumThis+= card.getValue();
        }
        
        for (Card card : other.list) {
            sumOther += card.getValue();
        }
        
        return sumThis - sumOther;
         //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
