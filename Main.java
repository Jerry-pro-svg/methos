class Employee {
    private final String name;
    private final double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }


    
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);

    }
}


public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        Employee emp3 = new Employee("Charlie", 70000);


        System.out.println("Employee Details:");
        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
        System.out.println();

        emp3.displayDetails();
    }
}

