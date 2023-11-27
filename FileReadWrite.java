import java.io.*;

public class FileReadWrite 
{
    public static void main(String[] args)
     {
        try {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter input file name: ");
            String inputFileName = reader.readLine();

            
            FileInputStream fileInputStream = new FileInputStream(inputFileName);

            System.out.print("Enter output file name: ");
            String outputFileName = reader.readLine();

            
            FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);

            int data;
            
            while ((data = fileInputStream.read()) != -1) 
            {
                fileOutputStream.write(data);
            }

            
            fileInputStream.close();
            fileOutputStream.close();

            System.out.println("File read and write completed successfully.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading/writing the file: " + e.getMessage());
        }
    }
}

