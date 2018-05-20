package com.nibblemail;

public class Main {

    public static void main(String[] args) {
        Car kia = new Car(5,4,56.8d,78.8d);
        Car ford = new Car(6,7,56.8d);
        Car mustang = new Car(6, 6 );
        System.out.println
            (
                MpgCal.Calculation(kia.getFuel(),kia.getMpg(),1d) ?"You can go" :"you cant go"
            );
    }
}
