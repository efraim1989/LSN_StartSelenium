package hw_oop4_employees;

public class SalaryEmployee extends Employee implements Salary{
    private double salary;


    public SalaryEmployee(int id, String name, int age, double salary) {
        super(id, name, age);
        if(salary<minSalary){
            this.salary = minSalary;
        }else {
            this.salary = salary;
        }

    }

    public double getSalary() {
        return salary;
    }


//    @Override
//    public double calcSalary() {
//        return salary;
//    }

    @Override
    public String toString() {
        return super.toString() + " salary = " + salary;
    }

    @Override
    public double calcSalary() {
        return 0;
    }

    //    @Override
//    public String toString() {
//        return "SalaryEmployee{" +
//                "salary=" + salary +
//                '}';
//    }
}
