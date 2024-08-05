package io.anviksha.demo;

public class BankAccount {
    private int number;
    private boolean active;
    private String holder;
    private double balance;

    //  constructor is a special kind of method that is used to initialize class variables
    //  constructor has the same name as the class, but no return type is mentioned
    //  If there are no constructors, only then the compiler inserts a default constructor as:
    //  public BankAccount() { }

    //  explicit constructor is written for demonstration
    public BankAccount() {
        System.out.println("Inside the BankAccount constructor");
    }

    public void deposit(double amount) {
        //  logic
    }

    public void withdraw(double amount) {
        //  logic
    }
}
