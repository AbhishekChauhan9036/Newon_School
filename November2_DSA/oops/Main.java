package com.company.oops;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vehicle myVehicle = new Vehicle("Tarzan");
        myVehicle.run();
        Vehicle myVehicle2 = new Vehicle("Tarzan 2");
        myVehicle2.run();

        Cars cars = new Cars("Alto");
        cars.run();
        cars.applyBrakes();
    }
}
