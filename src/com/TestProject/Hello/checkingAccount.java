package com.TestProject.Hello;

public class checkingAccount{

    private int balance;
    private String accountID;
    private Person accountHolder;

    public checkingAccount(String id, int balance, Person person){
        this.accountID = id;
        this.balance = balance;
        this.accountHolder = person;
    }

    public int takeMoneyFromAccount(int amount){
        balance -= amount;
        return balance;
    }

    public int depositMoneyIntoAccount(int amount){
        balance += amount;
        return balance;
    }

    public int getBalance(){return balance;}

    public boolean isAccountID(String id){
        return this.accountID.equals(id);
    }

    public boolean isAccountHolder(Person person){
        return accountHolder == person;
    }


}
