package org.fasttrackit;

public class Vehicle {

    private static int totalCount; //variabila care se schimba in toata aplicatia ; se mai numesc variabile de clasa

    private String name;
    private double mileage;
    private double maxSpeed;
    private String fuelType;
    private double fuelLevel;
    private double traveledDistance;
    private int doorCount;
    private boolean running;

    public Vehicle() {
        totalCount ++;   //mai apare o masina
    }

    public double accelerate(double speed, double durationInHours) { //semnatura metodei
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h. ");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance; //sau cu +=

        double usedFuel = distance * mileage / 100;
        System.out.println("Used Fuel: " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

       // incrementare fuelLevel = fuelLevel++;

        return distance;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim(); //sterge spatiile de la inceput si final
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public static int getTotalCount() {
        return totalCount;
    }
}