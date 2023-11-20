import java.util.Scanner;


class CustomException extends Exception 
{
    public CustomException(String message) 
    {
        super(message);
    }
}

public class CustomExceptionExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than 100: ");
        int userInput = scanner.nextInt();

        try 
        {
            if (userInput <= 100)
             {
                throw new CustomException("Number should be greater than 100");
            } 
            else 
            {
                System.out.println("Entered number is greater than 100: " + userInput);
            }
        } 
        catch (CustomException e)
         {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        scanner.close();
    }
}

