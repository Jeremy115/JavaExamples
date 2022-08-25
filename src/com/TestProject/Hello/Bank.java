package com.TestProject.Hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Bank {

    private String name;
    private List<checkingAccount> checkingAccount;

    private final int MAX_WITHDRAW = 500;

    private final int MIN_DEPOSIT = 150;


    public Bank(String name){
        this.name = name;
        checkingAccount = new ArrayList<>();
    }

    public boolean withdrawAmount(int amount, Person person){
        if(getAccountByPerson(person).getBalance() - amount <= MAX_WITHDRAW){
            System.out.println("Cannot withdraw over the limit!");
            return false;
        }
        getAccountByPerson(person).takeMoneyFromAccount(amount);
        return true;

    }

    public boolean openBankAccount(Person person, int initialDeposit){
        boolean backOpened = canBankAccount(person, initialDeposit);

        if(backOpened){
            checkingAccount.add(new checkingAccount(getRandomId(), initialDeposit, person));
        }
        return backOpened;
    }
    private String getRandomId(){
        int id = new Random().nextInt(4124124);
        return this.name.charAt(0) + ":" + id;
    }

    public checkingAccount getAccountByPerson(Person person){
        for(checkingAccount account: checkingAccount){
            if(account.isAccountHolder(person)){
                return account;
            }
        }
        return null;
    }

    private boolean canBankAccount(Person person, int initialDeposit){
        boolean bankOpened = false;

        if(!person.isOlderThan(16)){

            System.out.println(person.getFullName() + " is not old enough to open a bank account!");

        }else {
            bankOpened = true;
        }

        if(initialDeposit < MIN_DEPOSIT){
            System.out.println("The deposit of " + initialDeposit + " is not enough. Need at least " + MIN_DEPOSIT);
        }else{
            bankOpened = true;
        }

        return bankOpened;
    }

}
