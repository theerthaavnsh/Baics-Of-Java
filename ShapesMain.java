import java.util.Scanner;

// Abstract class Shape
abstract class Shape 
{
    // Abstract method to get the number of sides
    public abstract void numberOfSides();
}

// Rectangle class extending Shape
class Rectangle extends Shape 
{
    @Override
    public void numberOfSides()
     {
        System.out.println("A rectangle has 4 sides.");
    }
}

// Triangle class extending Shape
class Triangle extends Shape 
{
    @Override
    public void numberOfSides() 
    {
        System.out.println("A triangle has 3 sides.");
    }
}

// Hexagon class extending Shape
class Hexagon extends Shape 
{
    @Override
    public void numberOfSides() 
    {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class ShapesMain 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("Choose a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Hexagon");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    Rectangle rectangle = new Rectangle();
                    rectangle.numberOfSides();
                    break;
                case 2:
                    Triangle triangle = new Triangle();
                    triangle.numberOfSides();
                    break;
                case 3:
                    Hexagon hexagon = new Hexagon();
                    hexagon.numberOfSides();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } 
        while (choice != 0);

        scanner.close();
    }
}

