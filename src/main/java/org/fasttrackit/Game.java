package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3]; // nr circuite, trebuie specificata lungimea; LUCRU CU SIRURI
    private List<Vehicle> competitors = new ArrayList<Vehicle>(); //sau doar <>


    public void start() {
        initializeTracks();
        displayTracks();
        initializeCompetitors();


    }

    private void initializeCompetitors() {
        int competitorCount = getCompetitorCountFromUser();

        System.out.println("Today's competitors are: ");

        for (int i = 0; i < competitorCount; i++) {
            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6, 12));
            competitor.setFuelLevel(80);

            System.out.println(competitor);

            competitors.add(competitor);

            //competitors.size(); - metoda la lista
        }

    }

    private int getCompetitorCountFromUser() {
        System.out.println("Please enter number of players.");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();             //citire si returnare jucatori
        } catch (InputMismatchException e) {     //e variabila folosita pt exceptii

            throw new RuntimeException("You have entered an invalid number.");

        } finally {           //optional
            System.out.println("Finally block is always executed.");
        }
    }

    private void initializeTracks() { //chemare metoda

        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLength(400);

        tracks[1] = track2;

    }

    private void displayTracks() {
        System.out.println("Available tracks: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(tracks[i].getName() + " - Length: " + tracks[i].getLength() + " km. ");
            }
        }


    }
}
