/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class login {

   boolean isValid(String enteredEmail,String enteredPassword){
        String name = enteredEmail;
        String password = enteredPassword;
        if (name.isEmpty() || name.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (password.equalsIgnoreCase("") && name.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else {
            //check if the username and password valid 
            try {
                Singleton singleton = Singleton.getInstance();
                File database = singleton.getFile(); // Singleton
                Scanner input = new Scanner(database);
                while (input.hasNext()) {
                    if (input.next().equalsIgnoreCase("login")) {
                        String nameFile = input.next();
                        String passFile = input.next();
                        if (nameFile.equals(name) && passFile.equals(password)) {
                            return true; //retrun true to open home page and close this page 
                        }

                    } else {
                        String line = input.nextLine();
                    }
                }
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(loginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Sorry we could not find your account");
        }
       
        return false;
    }
}
