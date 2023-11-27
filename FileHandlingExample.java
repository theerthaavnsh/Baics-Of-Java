import java.io.*;

public class FileHandlingExample 
{

    public static void main(String[] args) 
    {
        String filePath = "example.txt"; 
        
        try (FileWriter fileWriter = new FileWriter(filePath)) 
        {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter data to write to the file: ");
            String userInput = reader.readLine();
            
            
            fileWriter.write(userInput);
            System.out.println("Data written to the file successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error writing to the file: " + e.getMessage());
        }

        
        try (FileReader fileReader = new FileReader(filePath)) 
        {
           
            System.out.println("Reading data from the file:");
            int character;
            while ((character = fileReader.read()) != -1) 
            {
                System.out.print((char) character);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

