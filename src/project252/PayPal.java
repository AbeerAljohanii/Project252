/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.util.HashMap;
import java.util.Map;

public class PayPal implements PayStrategy { 
    private Map<String, String> CreditInfor = new HashMap<>();
    private String Email;
    private String password;

    public PayPal() {
    }

    public PayPal(String Email, String password) {
        this.Email = Email;
        this.password = password;
    }
    
    void add(){
       CreditInfor.put("ra52mii@gmail.com", "67890");
       CreditInfor.put("shatha@gmail.com","12345");
    }
    @Override
    public String pay(double paymentAmount) {
        if(CreditInfor.containsValue(Email) && CreditInfor.containsValue(password)){
            return "Paying " + paymentAmount+ " using PayPal successfully";
        } else{
            return null;
        } 
    }  
}
