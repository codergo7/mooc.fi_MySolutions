
public class Money {

    private final int euros;
    private final int cents;
    private Money nevM;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    public Money minus(Money decreaser) {
        int eur = this.euros-decreaser.euros;
        int cent = this.cents-decreaser.cents;
        if(cent<0){
            cent+=100;
            eur-=1;
        }
        
        if(eur<0){
            eur=0;
            cent=0;
        }
        
        //Money newM = new Money(eur, cent);
        
        return new Money(eur, cent);        
    }
    
    public boolean lessThan(Money compared){
        if(this.euros<compared.euros){
            return true;
        }
        if(this.euros==compared.euros && this.cents<compared.cents){
            return true;
        }
        return false;
    }
    
    public Money plus(Money addition){
      Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
            
      return newMoney;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
