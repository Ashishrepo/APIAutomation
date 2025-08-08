package Files;

import java.io.*;

public class BufferedWriteRead {

    public static void writeIntoFile(String filePath) {

        try (BufferedWriter bwr = new BufferedWriter(new FileWriter(filePath))) {

            bwr.write("Welcome to GL BLR ofc. and GLOBAL logic...");
            bwr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static void read(String filePath) {

        try (BufferedReader bfr = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = bfr.readLine()) != null) {

                System.out.println(line);

            }
            bfr.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void writeUsingFileWriter(String filePath) {

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write("dccccccccccccccccccccccccccccccccccc");
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "/src/main/java/Files/example1.txt";
        writeIntoFile(filePath);
       read(filePath);

    }


}
