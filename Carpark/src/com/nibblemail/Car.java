package com.nibblemail;
import java.lang.Exception;

public class Car {
    private final double MAX_FUEL;
    private int seats;
    private int passengers;
    private double fuel;
    private double mpg;
    
    public Car (int seats, int passengers,double maxFuel, double fuel, double mpg) throws Exception{
        this(seats, passengers,maxFuel, fuel);
        this.setMpg(mpg);
    }
    public Car(int seats, int passengers, double maxFuel, double fuel) throws Exception{
        this(seats, passengers, maxFuel);
        this.refuel(fuel);
    }
    public Car(int seats,int passengers, double maxFuel) throws Exception{
        this(seats, maxFuel);
        this.setPassengers(passengers);
    }
    public Car(int seats, double maxFuel) throws Exception{
        this.setSeats(seats);
        // No setter as var is final so check goes here
        if(maxFuel < 0) {
            throw new Exception("A Car may not have negative fuel.");
        }
        else
            this.MAX_FUEL = maxFuel;
    }

    public double getMaxFuel() {
        return MAX_FUEL;   
    }
    
    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) throws Exception{
        if(mpg < 0)
            throw new Exception("You want to gain fuel as you drive huh? me too...");
        this.mpg = mpg;
    }

    public double getFuel() {
        return fuel;
    }

    
    /*
    * Changed from 'setFuel' to demo abstraction.
    * IE. you don't go to the petrol station and set your fuel to 3/4
    * You instead refuel by 15L (Or £20) or wait till it (hopefully) clicks full
    * Abstraction is not really necesary here but good place to demo xoxo
    */
    // Fill the tank by an 'amount'. if overfill: throw exception.
    public void refuel(double amount) throws Exception {
        if(this.MAX_FUEL < this.fuel + amount)
            throw new Exception("Overfueled, put the cig down.. carefully.");
        this.fuel += amount;
    }
    
    // Fill the tank and return the amount inputted, you don't have to do anything with
    // the diff but it is available.
    public double fullRefuel() {
        double diff = this.MAX_FUEL - this.fuel;
        this.fuel = this.MAX_FUEL;
        return diff;
    }

    public int getSeats() {
        return seats;
    }
    
    public void setSeats(int seats) throws Exception{
        if(seats < 0) 
            throw new Exception("A Car may not have negative seating.");
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) throws Exception {
        if(passengers < 0)
            throw new Exception("We don't want negative people in our lives, let alone our cars.");
        this.passengers = passengers;
    }


}
