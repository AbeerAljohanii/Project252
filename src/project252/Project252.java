package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project252 {

    static String Sname, Spass;
    int index = 0;
    CookiesFactory cookeisF = new CookiesFactory(); 
    
    static ArrayList<Cookies> cookie = new ArrayList<>();
    
    public static void main(String[] args) { 
    }
    
    public void login(String name, String pass) throws FileNotFoundException {
        Sname = name;
        Spass = pass;
        
        File F3 = new File("info.txt");
        Singleton s = Singleton.getInstance();
        File F1 = s.getFile(); // Singleton
        
        login l = new login();
        Scanner input = new Scanner(F1);
        
        int size = input.nextInt();
        boolean check = false;
        String nameFile = input.next();
        String passFile = input.next();
        
        if (name.equalsIgnoreCase(Sname) && passFile.contains(Spass)) {
            check = true;
        }
        l.getcheck(check);
        input.close();
    }
    void cookies(int count, String type , Extra extra) {
            switch (type) {
                case "Chocolate chip":
                    cookie.add(cookeisF.getCookies("Chocolate chip"));
                    index++;
                    break;
                case "Simple Chip":
                    cookie.add(cookeisF.getCookies("Simple Chip"));
                    index++;
                    break;
                case "Chocolate Peanuts":
                    cookie.add(cookeisF.getCookies("Chocolate Peanuts"));
                    index++;
                    break;
                case "Birthday Cake":
                    
                    cookie.add(cookeisF.getCookies("Birthday Cake"));
                    index++;
                    break;
           
//            for (cookie k : cookie) {
//                if (k.getCookieType() == type) {
//                    k.setCount(count);
//                }
            }
        }
    }

