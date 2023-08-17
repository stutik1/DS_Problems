package Fast.Slow.Pointers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileParser {
    public static void main(String[] args) {
        String inputFilePath = "/Users/megha/Documents/input.txt";
        String outputFilePath = "/Users/megha/Documents/out.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            boolean foundDay = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Day")) {
                    foundDay = true;
                } else if (foundDay) {
                    writer.write(line);
                    writer.newLine();
                    foundDay = false;
                }
            }

            System.out.println("Extraction complete. Extracted data stored in " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

