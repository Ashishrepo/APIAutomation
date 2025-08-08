package Files;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.*;
import java.util.Properties;

public class PropertiesFileReadWrite {

    public static void writeIntoProperty(String filePath) {

        Properties prop = new Properties();

        prop.setProperty("EmpName", "Eshan Jain");
        prop.setProperty("Employer", "ABB");
        prop.setProperty("Age", "34");

        try(BufferedWriter bwr = new BufferedWriter(new FileWriter(filePath))) {
//            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

//        FileWriter writer = new FileWriter(filePath);

            prop.store(bwr, "Sample data in Prop file...");
            bwr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromProperty(String path) {

        Properties prop = new Properties();

        try (BufferedReader bfr = new BufferedReader(new FileReader(path))){
            prop.load(bfr);

            System.out.println(prop.getProperty("EmpName"));
            System.out.println(prop.getProperty("Employer"));
            System.out.println(prop.getProperty("Age"));

            bfr.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "/src/main/java/Files/example11.properties";
        writeIntoProperty(filePath);
        readFromProperty(filePath);

    }
}
