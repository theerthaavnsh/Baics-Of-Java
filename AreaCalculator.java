public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + calculateArea(5.0));
        System.out.println("Area of Rectangle: " + calculateArea(4.0, 6.0));
        System.out.println("Area of Triangle: " + calculateArea(3.0, 4.0));
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
