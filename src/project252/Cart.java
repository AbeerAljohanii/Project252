/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Cart {
    
    //attributes 
    static ArrayList<Cookie> cart = new ArrayList<>(); //array list contains all the cookies 
    static double totalPrice=0;//total price of the cart 
    CookiesFactory factory = new CookiesFactory();
    
    //---------------------------------------------------------------------------------------------
    //methods 
   
    //return all the cookies array list 
    public ArrayList<Cookie> getCookies() {
        return cart;
    }
    static void addToCart(Cookie c){
      cart.add(c); // add cookies to array list
      totalPrice+=c.getPrice(); // add the price in static total price
    }
    
    public void PrintReceipt(CartGUI cartPage){

        
        cartPage.receipt.setText("");//clear the receipt in the cart frame 
        cartPage.receipt.append(String.format("%-63s %-10s \n", "Item", "Price")); // print in receipt in cart frame
        for (int i = 0; i < cart.size(); i++) {
            cartPage.receipt.append("\n" + cart.get(i).information()); // print the order in cart frame
        }
        //open the cart frame and close this one 
        cartPage.TotalPrice.setText(String.format("%.2f $", Cart.totalPrice)); 
    }
}
