package oop;

public class Formula1 extends SportCar implements Moveable, Saleable{

    private double length;

    @Override
    public void sendSOS() {

        System.out.println("SOS from Formula 1");



    }
}
