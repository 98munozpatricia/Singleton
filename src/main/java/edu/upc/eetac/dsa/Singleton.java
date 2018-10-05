package edu.upc.eetac.dsa;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Singleton {
    private static Singleton instance;
    private ResourceBundle ca, es, en;
    HashMap<String,Singleton> hashMap = new HashMap<String,Singleton>();
    private static final String PACKAGE = "edu.upc.eetac.dsa";
    private Singleton() {

    }
    public static Singleton getInstance(){
        if (instance==null){ instance=new Singleton();}
        return instance;
    }

}
