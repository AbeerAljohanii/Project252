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
        File F = new File("mastercard.txt"); // read info of card from file
        Scanner input = new Scanner(F);

        int size = input.nextInt();
        do {
            String numberf = input.next();
            String Datef = input.next();
            String CVVf = input.next();
            if (numberf.equals(number) && Datef.equals(Datef) && CVVf.equals(CVV)) { // check if it equal to number, date and cvv that are invoke from mastercard frame 
                amount = input.nextDouble(); // read the amount from file
                return true;
            } else {
                amount = input.nextDouble();
            }
            size--;
        } while (size != 0);
        return false;
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
