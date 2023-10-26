package Abstraction;

import java.util.ArrayList;

public abstract class Vehicle {
    private String model, color;
    private int year;

    public Vehicle(){

    }

    public static void main(String[] args) {
        var vehicles = new ArrayList<Vehicle>();
        
        var car = new Car(8);
        var truck = new Truck("Food");
        
        vehicles.add(car);
        vehicles.add(truck);

        for (Vehicle v: vehicles){
            System.out.println(v);
        }
    }
}




