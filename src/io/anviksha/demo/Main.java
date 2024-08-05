package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  observe the call to the constructor on this line
        BankAccount account = new BankAccount(12234, true, "John Doe", 1500);

        account.deposit(1220);
        account.withdraw(100);
    }
}