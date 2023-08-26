package oop;

public class MainCar {

    public static void main(String[] args) {

        System.out.println("======================START OOP2=============================");


        int[] ar = {3,7,6};

        System.out.println(ar);

        System.out.println(ar[1]);

        Car c = new Car();

        System.out.println(c);

        System.out.println(c.getBrand());

        c.toDrive();

        Car.fire();

        System.out.println("=====================C1===========================");

        Car c1 = new Car(2020);

        System.out.println(c1.getYear());

        System.out.println("=====================C2===========================");


        Car c2 = new Car(0.0001, -2023, 2, "Fignya");

        System.out.println(c2);

        System.out.println("=====================C3===========================");


        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(100000);

        System.out.println(c3);

        System.out.println("=====================C4===========================");


        Car c4 = new Car()
                .withYear(2020)
                .withEngine(2.4);

        System.out.println(c4);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====================START OOP3===========================");



        SportCar sc1 = new SportCar();
        System.out.println(sc1.getBrand());

        Truck t1 = new Truck();


        Formula1 f1 = new Formula1();
        f1.sendSOS();

        f1.tosale();

        Moveable.anyMethod();   //static method of interface
        f1.otherMethods();      //default method of interface/ objects can use this type of methods!!!


        Car c5 = new Formula1();

        Moveable m1 = new Formula1();


        //        oop.Moveable m2 = new oop.Car();
        //////////////////////////////////////////////
        //overriding
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("=====================Overriding===========================");

        t1.toDrive();
        sc1.toDrive();
        f1.toDrive();

        Car[] cars = new Car[3];
        cars[0] = t1;
        cars[1] = sc1;
        cars[2] = f1;

        System.out.println();
        System.out.println("======for each car=======");

        for(Car car : cars) {
            car.toDrive();
        }
        System.out.println("===========================");



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

================================================================

                            Inheritance

                                X  Moveable abstract sendSOS() X
                            oop.Car                                                      Boat
             |                               |                     |                             |
           oop.Truck                           oop.SportCar               FishBoat                     SportBoat
           |                                  |                |             |                  |
           AutoTRAIN                        fORMULA1         Motor          Paddle              Jet
                                length

                               send SOS signal

                               interface Moveable
                               sendSOS();
 */
