package edu.upc.eetac.dsa;

public class Singleton {
    private static Singleton instance;
    // [data]
    private Singleton() {
        //data= new ..
    }
    public static Singleton getInstance(){
        if (instance==null) instance=new Singleton();
        return instance;
    }

}
