/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PaymentCard {
    
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public void eatAffordably(){
        if(this.balance>=2.6){
            this.balance-=2.60;
        }
    }
    
    public void eatHeartily(){
        if(this.balance>=4.6){
            this.balance-=4.60;
        }
    }
    
    public void addMoney(double quantity){
        if(this.balance+quantity <= 150 && quantity>0){
            this.balance+= quantity;
        }
        else if(this.balance+quantity > 150){
            this.balance=150;
        }
        if(quantity<0){
            this.balance=this.balance;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
