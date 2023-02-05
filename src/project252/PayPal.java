
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
        Singleton singleton = Singleton.getInstance();
        File Database = singleton.getFile(); // Singleton
        Scanner input = new Scanner(Database); 
         while(input.hasNext()){
                    if(input.next().equalsIgnoreCase("paypal")){//the next information related to the paypal
                    String emailFile = input.next();
                    String passFile = input.next();
                    if (emailFile.equals(Email) && passFile.equals(password)) {
                        this.amount = input.nextDouble();
                        return true;//the information emtered matches the one in the database 
                    }
                  else {
                      double rest= input.nextDouble();
                }
                    
                    
                }else{
                        String line = input.nextLine();
                    }
         }
         input.close();
           return false;//no match 
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
