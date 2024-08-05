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

    //  amount here is a method parameter
    //  value passed to amount from the client is called the argument
    //  parameter can be qualified with final keyword, in which case it becomes a constant in the method
    public void deposit(double amount) {
        //  for method parameters, the definite assignment policy is enforced at the call site (in main in this example)
        //  so, amount can be used directly
        System.out.printf("depositing amount: %.2f\n", amount);

        final int i = 10;  //  final local variables are constants
        //  ++i;    //  error

        if (amount > 100) {
            int j = 99; //  still called a local variable, but the scope is if block
        }

        //  System.out.println(j);  //  error; j is not accessible outside the scope
    }

    public void withdraw(double amount) {
        //  logic
    }
}
