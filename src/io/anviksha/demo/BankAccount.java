package io.anviksha.demo;

public class BankAccount {
    private int number;
    private boolean active;
    private String holder;
    private double balance;


    //  constructor is used to initialize the fields
    //  constructor parameters and fields can have the same names as in this case (usually the case)
    //  in such case, the "this" qualifier is used to disambiguate the fields
    //  As such, this qualifier can be used (within the class) with any member of the class
    //  it is generally used in situations where disambiguation is needed

    //  It is often a good idea to initialize the fields from the values given by the client
    public BankAccount(int number, boolean active, String holder, double balance) {
        this.number = number;   //  this.number (field), number (parameter)
        this.active = active;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        //  logic
    }

    public void withdraw(double amount) {
        //  logic
    }
}
