package com.nibblemail;

public class MpgCal {
    public boolean Calculation(double fuel, double mpg, double distance){
        double miles = distance * 0.621;
        double gallons = fuel * 0.219;
        return (mpg > miles/gallons);
    }
}
