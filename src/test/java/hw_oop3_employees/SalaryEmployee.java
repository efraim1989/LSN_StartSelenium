package hw_oop3_employees;

public class SalaryEmployee extends Employee {
    private double salary;


    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public double calcSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " salary = " + salary;
    }

    //    @Override
//    public String toString() {
//        return "SalaryEmployee{" +
//                "salary=" + salary +
//                '}';
//    }
}
