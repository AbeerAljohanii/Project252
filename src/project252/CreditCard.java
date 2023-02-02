/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCard implements PayStrategy {

    String number;
    String Date;
    String CVV;
    double amount = 0;

    public CreditCard() {
    }

    public CreditCard(String number, String Date, String CVV) {
        this.number = number;
        this.Date = Date;
        this.CVV = CVV;
    }

    boolean check() throws FileNotFoundException {
        File F = new File("mastercard.txt");
        Scanner input = new Scanner(F);

        int size = input.nextInt();
        do {
            String numberf = input.next();
            String Datef = input.next();
            String CVVf = input.next();
            if (numberf.equals(number) && Datef.equals(Datef) && CVVf.equals(CVV)) {
                amount = input.nextDouble();
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
            return "Paying " + paymentAmount + " using CreditCard successfully";
        } else {
            return null;
        }
    }
}
