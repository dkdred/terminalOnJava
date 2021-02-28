package com.company;

public class User {
    private String FIO;
    private int balance;
    private int minBalance;

    public User(){
        FIO = "Kekich";
        balance = 10000;
        minBalance = 500;
    }

    public int getMinBalance(){
        return minBalance;
    }

    public int getBalance(){
        return balance;
    }

    public String getFIO(){
        return FIO;
    }

    public void minusBalance(int value) throws Exception {
        if(balance < value ){
            throw new Exception( "У вас недостаточно средств на счете" );
        }
        balance -= value;
    }
    public void plusBalance(int value) throws Exception {
        if(value < getMinBalance() ){
            throw new Exception( "Введенная сумма меньше " + getMinBalance() );
        }
        balance += value;
    }
}
