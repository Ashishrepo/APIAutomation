package Files;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadWriteCSVFiles {


    public static void readCSVFile(String filePath) {

        try{

            BufferedReader reader= new BufferedReader(new FileReader(filePath));
            String line;
            while((line= reader.readLine())!=null){
                String[] data=line.split(",");
                Arrays.stream(data).forEach(e-> System.out.print(e+" "));
                System.out.println();

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void writeToCSV(String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {


            // Write the header
            writer.write("Name,Age,Country");
            writer.newLine();

            // Write rows
            writer.write("Alice,30,India");
            writer.newLine();
            writer.write("Drake,25,USA");
            writer.newLine();
            writer.write("Harry,28,UK");
            writer.newLine();

            System.out.println("CSV file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/main/java/Files/TestFile.csv";
        writeToCSV(filePath);
        readCSVFile(filePath);
    }
}
