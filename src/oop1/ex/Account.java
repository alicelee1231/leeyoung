package oop1.ex;

public class Account {
    int balance;


    int deposit(int amount){
        balance += amount;
        return  balance;
    }
    int withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        }else {
            System.out.println("잔액부족");
        }
        return balance;
    }

}
