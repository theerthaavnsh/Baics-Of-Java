// parent class
class Employee {
    public void display() 
    {
        System.out.println("Name of the class is Employee.");
    }

    public void calcSalary()
     {
        System.out.println("Salary of an employee is 10000.");
    }
}

// Child class Engineer inheriting from Employee
class Engineer extends Employee 
{
    @Override
    public void calcSalary() 
    {
        System.out.println("Salary of an engineer is 20000.");
    }
}

public class EngineerMain 
{
    public static void main(String[] args) 
    {
        Engineer engineer = new Engineer();

        // Displaying engineer salary
        engineer.calcSalary();

        // Displaying from Employee class using the same object
        engineer.display();
        engineer.calcSalary(); // Calls the overridden method in Engineer class
    }
}

