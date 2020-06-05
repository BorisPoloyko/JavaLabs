package com.company.airport;
import com.company.passenger.Passenger;
import com.sun.xml.internal.ws.api.pipe.PipelineAssembler;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;


public class Airport implements Iterable<Passenger>{
    public static final int DEFAULT_AIRPORT_CAPACITY = 100;
    private Queue<Passenger> passengers = null;
    private Airport() {
        passengers = new LinkedBlockingQueue<Passenger>(DEFAULT_AIRPORT_CAPACITY);
    }
    private Airport(int capacity){
        passengers = new LinkedBlockingQueue<Passenger>(capacity);
    }

    public static Airport createAirport(int capacity){
        Airport airport = new Airport(capacity);
        return  airport;
    }

    public static Airport createAirport(int capacity, List<Passenger> passengers) {
        Airport airport = new Airport(capacity);
        airport.passengers.addAll(passengers);
        return airport;
    }

    public Passenger getPassenger(){
        return passengers.poll();
    }

    public boolean setPassenger(Passenger passenger){
        return passengers.add(passenger);
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengers.iterator();
    }
}
