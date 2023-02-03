/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.util.ArrayList;

public class Cart {
    
    static ArrayList<Cookies> cookie = new ArrayList<>(); 
    static double totalPrice=0;
    CookiesFactory factory = new CookiesFactory();
    
    public ArrayList<Cookies> getCookie() {
        return cookie;
    }
    static void addarray(Cookies c){
      cookie.add(c); // add cookies to array list
      totalPrice+=c.getPrice(); // add the price in static total price
    }
    
    Cookies typeOfCookies(String type){
        return factory.getCookies(type); // return the type of cookies that creation from factory class
    }  

}
