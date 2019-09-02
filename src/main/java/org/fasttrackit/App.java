package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        Car car = new Car(engine);  //1. creare motor
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;  //consum
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";

        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        System.out.println(car.engine.manufacturer);

        car.accelerate(60, 1);  // car = VARIABILA !!!! nu clasa

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 2000;

        Car car2 = new Car(engine2);
        car2.name = "Golf";
        car2.fuelLevel = 50;
        car2.doorCount = 3;
        car.maxSpeed = 200;
        car.fuelType = "Diesel";

        car.name = "Skoda";

//        car.name = null;

        System.out.println("Car2 name: " + car2.name); //concatenare
        System.out.println("Car1 name: " + car.name);

        car = car2;


    }
}
