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
//import java.util.Scanner;
public class Security_check {
  
    public void Check(int cardNo){
    /*Scanner sc=new Scanner(System.in);
    cardNo=sc.nextLine();*/
    
    
    if(cardNo == 3370)
    {
    System.out.println("Correct Card Number");
    } 
    else {
System.out.println("Invalid Card Number");

}
    
}
}