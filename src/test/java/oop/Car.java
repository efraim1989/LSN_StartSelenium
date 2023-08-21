package oop;

public class Car{
////////////////////////////////////////////////////////////////
    // characteristics - fields - properties - data members

    private double engine; // 8byte
    private int year; // 4byte
    private boolean electric; // 1byte
    private String[] colors; // 16byte(8 ???)

    private int colorCode; // 4byte
    private String brand = "Honda"; // 16byte(8 ???)
    private String model;   // 16byte(8???)
    private double price; // 8byte

////////////////////////////////////////////////////////////////

   // behaviour(povedenie) - methods

    //1. object non static
    public void toDrive(){
        System.out.println("Driving");
        anyPivateMethod();
    }

    public void toStop(){
        System.out.println("Stopping");
    }

    private void anyPivateMethod(){
        System.out.println("anyPivate");
    }

    //2. class static
    public static void fire(){
        System.out.println("Fire fighting");
    }

    // type + name + type paramrter = signature !!!!!

////////////////////////////////////////////////////////////////////////
    //constructors

    // 1. default constructor//
   public Car(){}


    // 2. custom constructors//

    public Car(int year){
        this.year = year;
    }

    public Car(int year, double engine, boolean electric, int colorCode, String model) {
        this.engine = engine;
        this.electric = electric;
        this.colorCode = colorCode;
        this.model = model;
    }

    public Car(double engine, int year, int colorCode, String model) {
     //   this.engine = engine;
        setEngine(engine);
        if (year < 1900) {
            return;}else {
            this.year = year;
        }
        this.year = year;
        this.colorCode = colorCode;
        this.model = model;
    }
//===========================================================
    //setters// & modified setters //

    public void setEngine(double engine) {
        if(engine<0) return;
        this.engine = engine;
    }

    public Car withEngine(double engine) {
        if(engine<0) return this;
        this.engine = engine;
        return this;
    }

    public void setYear(int year) {
        if(year<2000) return;
        this.year = year;
    }

    public Car withYear(int year) {
        if(year<2000) return this;
        this.year = year;
        return this;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //================================================================

    //getters//

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

//================================================================================
    //toString methods

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", year=" + year +
                ", electric=" + electric +
                ", colorCode=" + colorCode +
                ", brand=" + brand +
                ", model=" + model +
                ", price=" + price +
                '}';
    }


}

/*
    Israel                                                              USA
    O
    X   []   ?   customs  ->       \___[]___________}  -> customs ? -> []
                                        class
                 setter(?)                                   getter()



 */


