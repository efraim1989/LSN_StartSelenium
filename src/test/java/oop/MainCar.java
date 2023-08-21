package oop;

public class MainCar {

    public static void main(String[] args) {


        Car c = new Car(2007, 2000, true, 1, "BMW");

        System.out.println(c);
        System.out.println(c.getBrand());

        Car c1 = new Car();
        System.out.println(c1.getYear());

        Car c2 = new Car(2000, 0.0001, true, 1, "BMW");

        System.out.println(c2);

        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(100000);

        System.out.println(c3);

        Car c4 = new Car()
                .withYear(2020)
                .withEngine(2.4);

        SportCar sc1 = new SportCar();
        System.out.println(sc1.getBrand());

        Truck t1 = new Truck();


        Formula1 f1 = new Formula1();
        f1.sendSOS();

        Moveable.anyMethod();
        f1.otherMethods();


        Car c5 = new Formula1();

        Moveable m1 = new Formula1();


        //        oop.Moveable m2 = new oop.Car();

        t1.toDrive();
        sc1.toDrive();
        f1.toDrive();

        Car[] cars = new Car[3];
        cars[0] = t1;
        cars[1] = sc1;
        cars[2] = f1;


        for(Car car : cars) {
            car.toDrive();
        }

        Moveable[] arr = new Moveable[2];
        arr[0] = new Formula1();
        arr[1] = new Truck();

        for(Moveable mov : arr) {
            mov.sendSOS();
        }





    }



}


/*

            Stack                               Heap

    oop.Car c <------------- reference ------ { engine = 0.0
                                            year = 0
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }
    oop.Car c1 <------------- reference ------ { engine = 0.0
                                            year = 2020
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }

                            Inharitance

                                X  oop.Moveable abstract sendSOS() X
                            oop.Car                                                      Boat
             |                               |                     |                             |
           oop.Truck                           oop.SportCar               FishBoat                     SportBoat
           |                                  |                |             |                  |
           AutoTRAIN                        fORMULA1         Motor          Paddle              Jet
                                length

                               send SOS signal

                               interface oop.Moveable
                               sendSOS();
 */
