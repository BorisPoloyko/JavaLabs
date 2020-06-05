package com.company.plane;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;
import com.company.passenger.*;
import com.company.airport.*;

public class Plane  implements  Runnable{
    private Phaser phaser;
    private int id;
    private int capacity;
    private int distance;
    private Airport airportFrom;
    private Airport airportTo;
    private Queue<Passenger> bodyAirport;


    public Plane(Phaser phaser, int id, int capacity, int distance, Airport airFrom, Airport airTo){
        this.phaser = phaser;
        this.id = id;
        this.capacity = capacity;
        this.bodyAirport = new ArrayDeque<Passenger>(capacity);
        this.airportFrom = airFrom;
        this.airportTo = airTo;
        this.phaser.register();
    }

    public void run(){
        loadPlane();
        phaser.arriveAndAwaitAdvance();

        flyPlane();
        phaser.arriveAndAwaitAdvance();

        unloadPlane();
        phaser.arriveAndDeregister();
    }

    private void loadPlane() {
        for(int i = 0; i < capacity; i++) {
            Passenger g = airportFrom.getPassenger();
            if (g == null) {
                return;
            }
            bodyAirport.add(g);
            System.out.println("Самолет №" + id + " взял на борт пассажира №" + g.getId());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void unloadPlane() {
        int size = bodyAirport.size();
        for (int i = 0; i < size; i++) {
            Passenger g = bodyAirport.poll();
            airportTo.setPassenger(g);
            System.out.println("Самолет №" + id + " высадил пассажира №" + g.getId());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
    private void flyPlane() {
        try {
            Thread.sleep(new Random(100).nextInt(700));
            System.out.println("Самолет №" + id + " начал полет.");
            Thread.sleep(new Random(100).nextInt(1500));
            System.out.println("Самолет №" + id + " закончил полет.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

