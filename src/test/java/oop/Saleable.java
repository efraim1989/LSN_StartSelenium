package oop;

public interface Saleable {

    default void tosale() {
        System.out.println("I'm saling");
    }
}
