package com.company;

import com.company.airport.Airport;
import com.company.passenger.Passenger;
import com.company.plane.Plane;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {
        //1-ое и 2-ое места назначения находятся в зоне дальности до 1000 км
        //3-е и 4-ое места назаначения находятся в зоне дальности больше 100 км
        //пассажиры, ожидающие в аэропорте
        Passenger[] passengers = new Passenger[180];
        for(int i = 0; i < passengers.length; i++){
            passengers[i] = new Passenger(i + 1);
        }

        //Будет 4 аэропорта(то есть 4 места назначения, однако все пассажиры вылетают из одного аэропорта)
        List<Passenger> listPassenger = Arrays.asList(passengers);
        //аэропорт, из которого забирают пассажиров
        Airport airport0 = Airport.createAirport(listPassenger.size(), listPassenger);
        //аэропорт доставки
        Airport airport1 = Airport.createAirport(listPassenger.size());
        Airport airport2 = Airport.createAirport(listPassenger.size());
        Airport airport3 = Airport.createAirport(listPassenger.size());
        Airport airport4 = Airport.createAirport(listPassenger.size());


        //фазер для синхронизации полета самолетов
        Phaser phaser = new Phaser();
        phaser.register();
        int currentPhase;
        //создание самолетов
        Thread plane1 = new Thread(new Plane(phaser, 1, 30, 1500, airport0, airport1));
        Thread plane2 = new Thread(new Plane(phaser, 2, 20, 1500, airport0, airport1));

        Thread plane3 = new Thread(new Plane(phaser, 3, 30, 1800,airport0, airport2));
        Thread plane4 = new Thread(new Plane(phaser, 4, 30, 1800, airport0, airport2));

        Thread plane5 = new Thread(new Plane(phaser, 5, 40, 500, airport0, airport3));

        Thread plane6 = new Thread(new Plane(phaser, 6, 30, 300, airport0, airport4));

        displayPassengers("Пассажиры в первом аэропорту:", airport0);

        displayPassengers("Пассажиры в аэропорту направления 1:", airport1);
        displayPassengers("Пассажиры в аэропорту направления 2:", airport2);
        displayPassengers("Пассажиры в аэропорту направления 3:", airport3);
        displayPassengers("Пассажиры в аэропорту направления 4:", airport4);

        plane1.start();
        plane2.start();
        plane3.start();
        plane4.start();
        plane5.start();
        plane6.start();

        //Основным назначением класса Phaser является
        // синхронизация потоков, выполнение которых требуется разбить на отдельные этапы,
        //а эти фазы, в свою очередь, необходимо синхронизовать.
        //синхронизация посадки
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Загрузка самолетов завершена. Фаза " + currentPhase + " завершена");
        //синхронизация полета
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Полет самолетов завершен. Фаза " + currentPhase + " завершена");
        //синхронизация выгрузки пассажиров
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Высадка пассажиров завершена. Фаза " + currentPhase + " завершена.");
        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) {
            System.out.println("Фазы синхронизированы и завершены.");
        }
        displayPassengers("Пассажиры в первом аэропорту:", airport0);
        displayPassengers("Пассажиры в аэропорту направления 1:", airport1);
        displayPassengers("Пассажиры в аэропорту направления 2:", airport2);
        displayPassengers("Пассажиры в аэропорту направления 3:", airport3);
        displayPassengers("Пассажиры в аэропорту направления 4:", airport4);

    }

    public static void displayPassengers(String title, Airport airport) {
        System.out.println(title);
        Iterator<Passenger> airportIterator = airport.iterator();
        while (airportIterator.hasNext()) {
            System.out.print(airportIterator.next().getId() + " ");
        }
        System.out.println();
    }
}
