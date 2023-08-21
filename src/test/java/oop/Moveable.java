package oop;

public interface Moveable {

//    double length = 3.5;
    void sendSOS();

    static void anyMethod(){
        System.out.println("Any method");
    }

    default void otherMethods(){
        System.out.println("Other method");

    }


}
