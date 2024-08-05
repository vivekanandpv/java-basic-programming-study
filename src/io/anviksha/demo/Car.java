package io.anviksha.demo;

public class Car extends FourWheeler {
    public Car(String registrationNumber) {
        super(registrationNumber);  //  must be the first line, can be skipped if no argument is involved

        //  it's always the best idea to take the parameter from your client and pass it through,
        //  rather than hardcoding the value in the super() call
    }
}
