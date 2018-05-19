package com.nibblemail;

public class Car {
    private int seats;
    private int passengers;
    private double fuel;
    private double mpg;

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Car (int seats, int passengers, double fuel, double mpg){
        this(seats, passengers, fuel);
        this.setMpg(mpg);
    }

    public Car(int seats, int passengers, double fuel){
        this(seats, passengers);
    }
    public Car(int seats,int passengers){
        this(seats);
        this.setPassengers(passengers);
    }
    public Car(int seats){
        this.setSeats(seats);
        return;
    }
}
