/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MasterCard implements PayStrategy {
    //attributes 
    private String number;
    private String Date;
    private String CVV;
    private double amount = 0;

    public MasterCard(String number, String Date, String CVV) {
        this.number = number;
        this.Date = Date;
        this.CVV = CVV;
    }
    //check if the information entered by user are vaild 
    public boolean check() throws FileNotFoundException {

       // -----------------------------------------------------------------------------------
         Singleton singleton = Singleton.getInstance();
        File Database = singleton.getFile(); 
        Scanner input = new Scanner(Database); // read info of card from file
         while(input.hasNext()){//the file still have lines 
                    if(input.next().equalsIgnoreCase("mastercard")){//check if it is the information about mastercard
                        String numberf = input.next();
                        String Datef = input.next();
                        String CVVf = input.next();
                        // check if it equal to number, date and cvv that are invoke from mastercard frame 
                   if (numberf.equals(number) && Datef.equals(Datef) && CVVf.equals(CVV)) {
                       amount = input.nextDouble(); // read the amount from file
                       return true;//the information emtered matches the one in the database 
                    }
                  else {
                      double rest= input.nextDouble();
                }
                    
                    
                }String line = input.nextLine();
         }
         input.close();
           return false;//no match 
    
        
        
        
        
    }

    @Override
    public String pay(double paymentAmount) {
        if (paymentAmount <= amount) {
            amount -= paymentAmount;
            return "Paying " + String.format("%.2f $",paymentAmount) + " using CreditCard successfully"; // return paying successfully
        } else {
            return null;
        }
    }
}
