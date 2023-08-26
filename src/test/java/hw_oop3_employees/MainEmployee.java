package hw_oop3_employees;

public class MainEmployee {
    public static void main(String[] args) {

        SalaryEmployee se = new SalaryEmployee(12345, "John", 22, 500.50);
        SalaryEmployee se2 = new SalaryEmployee(12346, "Robert", 23, 560.50);
        WageEmployee we = new WageEmployee(12347, "Michael", 25, 10, 180);
        WageEmployee we2 = new WageEmployee(12348, "Nick", 31, 12, 180);
        Manager m = new Manager(12349, "Bob", 36, 800, 100);
        Manager m2 = new Manager(12350, "Lina", 20, 900, 100);

        Employee[] employees = new Employee[10];
        employees[0] = se;
        employees[1] = se2;
        employees[2] = we;
        employees[3] = we2;
        employees[4] = m;
        employees[5] = m2;

        print(employees);
        System.out.println("=================================");
        double totalSalary = printAdv(employees);

        double count = countEmployees(employees);
        double averageSalary = totalSalary / count;
        System.out.println("average salary: " + averageSalary);


        System.out.println("============================");
    }

    private static double countEmployees(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count;
    }

    public static void print(Employee[] e) {
        for (int i = 0; e[i] != null; i++) {
            System.out.println("Employee" + (i + 1) + " " + e[i].calcSalary());
        }
    }

    public static double printAdv(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary = totalSalary + employee.calcSalary();
            }
        }
        System.out.println("total salary: " + totalSalary);
        return totalSalary;
    }
}




