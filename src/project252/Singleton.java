package project252;

import java.io.File;

public class Singleton {

    private static Singleton instance = null;
    private static File file = new File("info.txt");

    private Singleton() {
    }
    private Singleton(File file) {
        this.file = file;
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(file);
        }
        return instance;
    }
    public static Singleton getInstance(File file) {
        if (instance == null) {
            instance = new Singleton(file);
        }
        return instance;
    }
   public File getFile() {
        return file;
    }
}
