package io.anviksha.demo;

public class BankAccount {
    //  a class has members
    //  fields are data members (state)
    //  methods are function members (behaviour)
    //  relevant fields and methods make the proper encapsulation
    //  exposing the relevant functionality to the clients (users) is abstraction

    //  fields are kept private so that direct external access is controlled
    //  if allowed, such direct access can disrupt the behaviour of the class
    //  fields are also called class variables
    //  when an object is created, these get the default values as zero-equivalents
    //  (numbers get 0, booleans get false, reference types get null)
    private int number;
    private boolean active;
    private String holder;
    private double balance;

    //  public methods are exposed to the client
    //  set of these public methods is the API of the class
    public void deposit(double amount) {
        //  logic
    }

    public void withdraw(double amount) {
        //  logic
    }
}
