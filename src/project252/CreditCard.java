/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.util.HashMap;
import java.util.Map;
public class CreditCard implements PayStrategy {
  private Map<String, String> CreditInfor = new HashMap<>();
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
        double amount = 400;
    }
    @Override
    public String pay(double paymentAmount) {
        if (paymentAmount <= amount) {
            amount -= paymentAmount;
            return "Paying " + paymentAmount+ " using CreditCard successfully";    
        } else{
            return null;
        }
    }
}
