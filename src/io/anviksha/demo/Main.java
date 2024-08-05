package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();    //  observe the call to the constructor on this line

        account.deposit(1220);
        account.withdraw(100);
    }
}