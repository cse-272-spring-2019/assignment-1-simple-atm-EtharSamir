/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;


/**
 *
 * @author Eithar Samir
 */import java.util.*;
public class ATM {

private double balance;

public ATM (double initialBalance){

initialBalance=0;
    balance=initialBalance;
    

}
    public void deposit (double amount){
balance=balance+amount;
makeTransaction("deposit",balance);

  }
    
    public void withdraw (double amount){
    balance=balance-amount;
    if(balance<0){
        System.out.println("balance is not enough");
        balance=balance+amount;}
    makeTransaction("withdraw",balance);
    }
    
    
    static ArrayList<String> transaction_name = new ArrayList<>();
	static ArrayList<Double> value_after_transaction = new ArrayList<>();
	
	public void makeTransaction (String string, double y){
		transaction_name.add(0,string);
		value_after_transaction.add(0,y);
                System.out.println(string);
                System.out.println(y);
    }
    
    
    
   /* public void makeTransaction (String string,double x){
		
		int count = 4;
		while(count>0)
		{
			transaction[count] = transaction[count-1];
			count--;
		}
		transaction[0] = string;
    
    }
    */
    
    
    public double getCurrentBalance(){
        makeTransaction("Current Balance",balance);
    return balance;
    }
    /**
     * 
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
     
        
         Scanner number = new Scanner(System.in);
      ATM x=new ATM();{
        x.deposit(50);
        x.withdraw(20);
        System.out.println(x.getCurrentBalance());
    }     */
        
   // TODO code application logic here
   

}


    

