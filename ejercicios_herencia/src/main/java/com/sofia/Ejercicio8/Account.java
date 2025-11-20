package com.sofia.Ejercicio8;

public class Account {
    
    double saldo;

    public void deposit(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {
        saldo -= amount;
    }
}
