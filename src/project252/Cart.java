/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.util.ArrayList;

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
}
