package oop;

public class SportCar extends Car {

    private int acceleration;

    @Override
    public void toDrive() {
        super.toDrive();
        System.out.println("Very fast!!!");
    }
}
