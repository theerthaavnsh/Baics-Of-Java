// Parent class Employee
class Employee 
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary)
     {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
}

// Child class Officer inheriting from Employee
class Officer extends Employee 
{
    String specialization;

    // Constructor
    public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) 
    {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

// Child class Manager inheriting from Employee
class Manager extends Employee 
{
    String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) 
    {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        // officer object
        Officer officer = new Officer("Anna B", 30, "9534567890", "MEC", 50000.0, "Finance");
        
        // manager object
        Manager manager = new Manager("Jane Smith", 35, "9876543210", "MEC", 80000.0, "HR");

        // details of manager and officer
        System.out.println("Officer Details:");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone Number: " + officer.phoneNumber);
        System.out.println("Address: " + officer.address);
        System.out.println("Salary: " + officer.salary);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}

