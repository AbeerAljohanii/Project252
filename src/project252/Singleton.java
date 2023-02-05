package project252;

import java.io.File;

public class Singleton {

    private static Singleton instance = null;
    private static File file = new File("database.txt");

    private Singleton() {
    }
    //make sure there is only one instance 
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
   public File getFile() {
        return file;
    }
}
