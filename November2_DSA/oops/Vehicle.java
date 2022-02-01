package com.company.oops;

public class Vehicle {

    protected final String vehicleName;

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void run() {
        System.out.println(this.vehicleName + " is running.");
    }

    public void applyBrakes() {
        System.out.println("applying brakes");
    }
}
