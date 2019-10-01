package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Game game = new Game();
        game.start();

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        Car car = new Car(engine);  //1. creare motor
        car.setName("Dacia");
        car.setFuelLevel(60);
        car.setMileage(8.5); //consum
        car.doorCount = 5;
        car.setMaxSpeed(180);
        car.setFuelType("Gasoline");

        System.out.println("Car object: " + car.toString()); //obiectul car(litere mici) ; reprezentare din clasa string, se poate si fara

        System.out.println(car.getName());
        System.out.println(car.getTraveledDistance()); // overriding - metoda print
        System.out.println(car.isRunning()); // isRunning for boolean !!!

        System.out.println(car.engine.manufacturer);

        car.accelerate(60, 1);  // car = VARIABILA !!!! nu clasa

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 2000;

        Car car2 = new Car(engine2);
        car2.setName("Golf");
        car2.setFuelLevel(50);
        car2.doorCount = 3;
        car.setMaxSpeed(200);
        car.setFuelType("Diesel");

        car.setName("Skoda");

//        car.name = null;

        System.out.println("Car2 name: " + car2.getName()); //concatenare
        System.out.println("Car1 name: " + car.getName());

        //car = car2;

//        System.out.println("Static variables example:");
//
//        //we should only call static variables from the class itself (Car) not from a variable containing an object of that class
//
//        car.totalCount =1;
//
//        System.out.println("Total count in car: " + car.totalCount);
//
//        car2.totalCount = 12;
//
//        System.out.println("Total count in car after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: " + Car.totalCount);

//        Vehicle hybridCar = new HybridCar();
//        //method implementation from object's class not from variable's class
//        //se schimba referinta dar ramane tot hybrid... nu il pun in cutia specifica hybrid ci in vechicle
//        hybridCar.setName("cheater");
//
//        hybridCar.accelerate(60,1);
//
//        System.out.println("Fuel level: " + hybridCar.getFuelLevel());
//        System.out.println("Traveled distance: " + hybridCar.getTraveledDistance());
//
//        //variable type decides what methods can be called
//        ( (HybridCar) hybridCar).fly(); //type casting - anunt ca vreau sa tratez obiectul ca si cum ar fi hybrid car

    }


}
