/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Debt {
    private double  balance;
    private double initialInterestRate;

    public Debt(double balance, double initialInterestRate) {
        this.balance = balance;
        this.initialInterestRate = initialInterestRate;
    }
    
    public void printBalance(){
        System.out.println(this.balance);
        
    }
    public void waitOneYear(){
        this.balance = this.balance*this.initialInterestRate;
        
    }
}
