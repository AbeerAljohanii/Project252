
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
            return "Paying " + String.format("%.2f $",paymentAmount)+ " using PayPal successfully";
        } else{
            return null;
        } 
    }  
}
