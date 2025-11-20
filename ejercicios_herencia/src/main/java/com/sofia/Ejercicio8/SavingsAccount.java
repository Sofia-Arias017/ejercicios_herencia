package com.sofia.Ejercicio8;

public class SavingsAccount extends Account {
    
    public void addInterest(double percent) {
        saldo += saldo * (percent / 100);
    }
}
