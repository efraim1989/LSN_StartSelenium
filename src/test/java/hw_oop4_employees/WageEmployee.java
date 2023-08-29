package hw_oop4_employees;

public class WageEmployee extends Employee implements Salary{

    private double hourWage;
    private double hours;

    public WageEmployee(int id, String name, int age, double hourWage, double hours) {
        super(id, name, age);
        if(hourWage<minHourWage){
        this.hourWage = minHourWage;}else{
        this.hourWage = hourWage;}
        if(hours<maxHours){
            this.hours = maxHours;
        }else {
            this.hours = hours;
        }
    }

    public double getHourPrice() {
        return hourWage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double calcSalary() {
        return hours * hourWage;
    }


    @Override
    public String toString() {
        return super.toString() + " " + calcSalary();
    }
}
