import java.io.*;

public class FileCopyWithStreams 
{
    public static void main(String[] args) 
    {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) 
        {
            System.out.println("Enter the source file path:");
            String sourceFilePath = reader.readLine();

            System.out.println("Enter the destination file path:");
            String destinationFilePath = reader.readLine();

            copyFile(sourceFilePath, destinationFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void copyFile(String sourceFilePath, String destinationFilePath) 
    {
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) 
             {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}

