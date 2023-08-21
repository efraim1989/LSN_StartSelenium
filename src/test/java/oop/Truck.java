package oop;

public class Truck extends Car implements  Moveable{

    @Override
    public void toDrive() {
        super.toDrive();
        System.out.println("Very slow!!!");
    }

    @Override
    public void sendSOS() {
        System.out.println("SOS from oop.Truck");
    }
}
