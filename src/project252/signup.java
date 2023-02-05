/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class signup {
   boolean flag ;
   
   boolean isValid(String nameField,String passField,String passConfirmField){
       
        Singleton singleton = Singleton.getInstance();
        File database = singleton.getFile(); // Singleton
        String name = nameField;
        String password =  passField;
        String password2 = passConfirmField;
        if (name.isEmpty() || name.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        }else if (password2.isEmpty() || password2.trim().equalsIgnoreCase("")) {//check if the user did not enter password confirmation
            JOptionPane.showMessageDialog(null, "Please Enter confirmation of the Password");
        } else if (password.equalsIgnoreCase("") && name.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
             } else if (!password.equals(password2)) { // check if the passwords don't match 
            JOptionPane.showMessageDialog(null, "passwords don't match");
        } else {//if all the fields are filled 
             try {
                Scanner input = new Scanner(database);
                flag = true;
                while(input.hasNext()){
                    if (input.next().equalsIgnoreCase("login")){
                    String nameFile = input.next();
                    String passFile = input.next();
                    if (nameFile.equals(name)) {//check if the username already exists 
                        flag = false;
                        break;
                    }
                }
                }
                    if (flag){//if the user name doesn't exitsts in the system 
                     try {
                         FileWriter fileWritter = new FileWriter(database.getName(), true);
                         BufferedWriter bw = new BufferedWriter(fileWritter);
                         bw.write("\nlogin "+name+" "+password);//write the new username and password to the loginGUI file 
                        bw.close();
                        return flag;  //retrun true to open home page and close this page 
                        } catch (IOException e) {
                            //exception handling left as an exercise for the reader
                        }
                    
                     
                    }
                    else {//the username already taken 
                      JOptionPane.showMessageDialog(null, "already existed username ");  
                    }
                  
                
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(loginGUI.class.getName()).log(Level.SEVERE, null, ex);
            
            
        
    }                                      
             }
        return flag;
   } 
}
