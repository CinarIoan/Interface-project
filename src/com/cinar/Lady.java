package com.cinar;

public class Lady extends Woman implements Female{
    boolean ladyHasPussy = hasPussy;
    boolean ladyLikesDick = false;

    @Override
    public void suck() {
        System.out.println("I don't suck dick!");
    }

    @Override
    public void fuck2() {
        System.out.println("I am a Lady fuck2");
    }
}
