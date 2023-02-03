
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PayPal implements PayStrategy { 
    private String Email;
    private String password;
    private double amount;

    public PayPal(String Email, String password) {
        this.Email = Email;
        this.password = password;
    }
    public boolean check() throws FileNotFoundException {
        File F = new File("paypal.txt"); // read info of card from file
        Scanner input = new Scanner(F);

        int size = input.nextInt();
        do {
            String emailf = input.next();
            String passwordf = input.next();
            if (emailf.equals(Email) && passwordf.equals(password)) { // check if it equal to email and password that are invoke from paypal frame 
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
            return "Paying " + String.format("%.2f $",paymentAmount)+ " using PayPal successfully"; // return paying successfully
        } else{
            return null;
        } 
    }  
}
