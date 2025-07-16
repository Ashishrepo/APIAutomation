package Files;

import com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.*;
import java.util.Properties;

public class PropertiesFileReadWrite {

    public static void writeIntoProperty(String filePath) {

        Properties prop = new Properties();

        prop.setProperty("EmpName", "Ashish Jain");
        prop.setProperty("Employer", "GL");
        prop.setProperty("Age", "31");

        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        FileWriter writer = new FileWriter(filePath);

            prop.store(writer, "Sample data in Prop file...");
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFromProperty(String path) {

        Properties prop = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            prop.load(fileInputStream);

            System.out.println(prop.getProperty("EmpName"));
            System.out.println(prop.getProperty("Employer"));
            System.out.println(prop.getProperty("Age"));

            fileInputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir") + "/src/main/java/Files/example.properties";
        writeIntoProperty(filePath);
        readFromProperty(filePath);

    }
}
