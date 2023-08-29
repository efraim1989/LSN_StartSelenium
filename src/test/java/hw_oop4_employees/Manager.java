package hw_oop4_employees;

public class Manager extends SalaryEmployee{

    private double bonuses;

    public Manager(int id, String name, int age, double salary, double bonuses) {
        super(id, name, age, salary);
        if (bonuses>maxBonuses){
            this.bonuses=maxBonuses;
        }else{
            this.bonuses = bonuses;
        }
    }

    public double getBonuses() {
        return bonuses;
    }


    @Override
    public double calcSalary() {
        return super.calcSalary() + super.calcSalary() * bonuses;
    }

    @Override
    public String toString() {
        return super.toString() + " " + calcSalary();
    }
}
