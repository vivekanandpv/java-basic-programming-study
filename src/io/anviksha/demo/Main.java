package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12234, true, "John Doe", 1500);

        account.deposit(122.33);
    }
}