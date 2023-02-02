/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PayPal implements PayStrategy { 
    private Map<String, String> CreditInfor = new HashMap<>();
    static private String Email;
    static private String password;
    double amount;

    public PayPal(String Email, String password) {
        this.Email = Email;
        this.password = password;
    }
//    void add(){
//       CreditInfor.put("ra52mii@gmail.com", "67890");
//       CreditInfor.put("shatha@gmail.com","12345");
//    }
//    
    boolean check() throws FileNotFoundException {
        File F = new File("paypal.txt");
        Scanner input = new Scanner(F);

        int size = input.nextInt();
        do {
            String emailf = input.next();
            String passwordf = input.next();
            if (emailf.equals(Email) && passwordf.equals(password)) {
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
            return "Paying " + paymentAmount+ " using PayPal successfully";
        } else{
            return null;
        } 
    }  
}
