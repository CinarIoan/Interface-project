package com.cinar;

public interface Female {
    boolean hasPussy = true;
    boolean likesDick = true;

    static void fuck(){
        if (hasPussy && likesDick){
            System.out.println("I like to fuck.");
        }
    }
    void suck();

}
