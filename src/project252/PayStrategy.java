/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.FileNotFoundException;

public interface PayStrategy {
    //methods implemeted in the subclasses 
    String pay(double paymentAmount);    
    boolean check() throws FileNotFoundException ;
}
