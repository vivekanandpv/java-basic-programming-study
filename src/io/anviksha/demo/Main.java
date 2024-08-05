package io.anviksha.demo;


public class Main {
    public static void main(String[] args) {
        //  First, take a look at the BankAccount.java file

        //  BankAccount is a class, account is a variable that points to an object of that class

        //  class is a blueprint and object is a realization of that
        //  object is also called an instance of the class

        //  new BankAccount() is often used to create an instance of the class
        BankAccount account = new BankAccount();

        //  API is now accessible on the object
        //  calling methods on the object
        account.deposit(1220);
        account.withdraw(100);

        //  private members are not accessible
        //  double d = account.balance;
    }
}