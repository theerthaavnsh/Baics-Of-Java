import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DisplayFile 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try 
        {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int lineNumber = 0;
            String line;

            while ((line = bufferedReader.readLine()) != null) 
            {
                lineNumber++;
                System.out.println(lineNumber + ": " + line);
            }

            bufferedReader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }
}

