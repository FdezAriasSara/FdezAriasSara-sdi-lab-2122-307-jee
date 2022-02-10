package com.uniovi.sdi;
//Clase empleada para crear un contador empleando un objeto Java Bean
public class Counter {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setIncrease(int increaseValue) {
        total += increaseValue;
    }
}