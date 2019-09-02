package org.fasttrackit;

public class Vehicle {

    String name;
    double mileage;
    double maxSpeed;
    String fuelType;
    double fuelLevel;
    double traveledDistance;
    int doorCount;
    boolean running;

    public double accelerate(double speed, double durationInHours) { //semnatura metodei
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h. ");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance; //sau cu +=

        double usedFuel = distance * mileage / 100;
        System.out.println("Used Fuel: " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    } //implemenatare metoda

}