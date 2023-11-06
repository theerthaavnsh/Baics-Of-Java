import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter the corresponding number: ");

        int choice = scanner.nextInt();

        double area = 0.0;
        if (choice == 1) {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = calculateArea(radius);
        } else if (choice == 2) {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            area = calculateArea(length, width);
        } else if (choice == 3) {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            area = calculateArea(base, height);
        } else {
            System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        if (area != 0.0) {
            System.out.println("Area: " + area);
        }

        scanner.close();
    }

    public static double calculateArea(double... dimensions) {
        if (dimensions.length == 1) {
            // Circle
            return Math.PI * dimensions[0] * dimensions[0];
        } else if (dimensions.length == 2) {
            // Rectangle
            return dimensions[0] * dimensions[1];
        } else if (dimensions.length == 2) {
            // Triangle
            return 0.5 * dimensions[0] * dimensions[1];
        }
        return 0.0;
    }
}

