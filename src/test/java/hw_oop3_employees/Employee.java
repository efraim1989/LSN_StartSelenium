package hw_oop3_employees;

public class Employee {
    private int id;
    private String name;
    private int age;


    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double calcSalary(){
        return 0;
    }

    public  String toString() {
        return id + " " + name + " " + age;
    }



}
