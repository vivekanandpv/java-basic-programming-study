package io.anviksha.demo;

public class BankAccount {
    private int number;
    private boolean active;
    private String holder;
    private double balance;


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

    //  getter and setters are called mutator methods: https://en.wikipedia.org/wiki/Mutator_method
    //  It is advisable to use IDE features to generate getter/setter when you need
    //  JavaBean specification governs the naming conventions
    //  https://download.oracle.com/otn-pub/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/beans.101.pdf?AuthParam=1722873627_35210c96ccb260643091d5761abb3c3d

    //  to provide readonly access to a field, a getter is used
    public int getNumber() {
        return number;
    }

    //  sometimes, a setter helps you set the value of a field
    //  may be after due validation
    public void setNumber(int number) {
        //  validation logic
        this.number = number;
    }
}
