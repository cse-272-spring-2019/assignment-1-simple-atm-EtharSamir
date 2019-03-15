/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Eithar Samir
 */
public class My_atm {
    
    public static ATM x =new ATM(0);
    
    
    public static void main (String [] args)
    {
 NewJFrame gui =new NewJFrame();
    NewJFrame.main(new String[0]);
   ATM z=new ATM(0);
   z.deposit(100);
   z.withdraw(10);
   z.getCurrentBalance();
    }    
}
