package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12234, true, "John Doe", 1500);

        account.setNumber(22334);
        System.out.println(account.getNumber());
    }
}