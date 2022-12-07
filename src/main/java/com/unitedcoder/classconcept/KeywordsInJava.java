package com.unitedcoder.classconcept;

public class KeywordsInJava {
    //                            Important knowledge

    //Final
    //Variable level - consistent value
    //method level - we can not override final method
    //class level - we can not extend final class

    //finally - block
    // used to put important codes, the finally block executes whether the exception handled or not

    //Finalize
    //Finalize is used to perform clean up activity before garbage collector
    public void finalize(){
        System.out.println("Finalize method....");
    }
    public static void main(String[] args) {
        KeywordsInJava k=new KeywordsInJava();
        //KeywordsInJava k1=new KeywordsInJava();
        k=null;
        //k1=null;
        System.gc();
        final int i=200;

    }
}
