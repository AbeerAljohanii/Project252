package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project252 {

    static String Sname, Spass;
    int index = 0;

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
        do {
            String nameFile = input.next();
            String passFile = input.next();
            if (nameFile.equals(Sname) && passFile.equals(Spass)) {
                check = true;
            }
            size--;
        } while (size != 0);
        l.getcheck(check);
        input.close();
    }
}
