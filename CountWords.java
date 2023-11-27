import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            // Allowing user input for the file name
            BufferedReader userInputReader = new BufferedReader(new java.io.InputStreamReader(System.in));
            System.out.print("Enter the file name with path: ");
            String fileName = userInputReader.readLine();

            // Open the file
            reader = new BufferedReader(new FileReader(fileName));

            // Read the file line by line
            String line;
            while ((line = reader.readLine()) != null) {
                // Increment line count
                lineCount++;

                // Split the line into words by spaces
                String[] words = line.split("\\s+");

                // Increment word count
                wordCount += words.length;

                // Increment character count for each line
                for (String word : words) {
                    charCount += word.length();
                }
            }

            // Display counts
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            try {
                // Close the BufferedReader
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}

