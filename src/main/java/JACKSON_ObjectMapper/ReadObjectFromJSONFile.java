package JACKSON_ObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadObjectFromJSONFile {

    public static void main(String[] args) throws IOException {

        ObjectMapper mp = new ObjectMapper();
        System.out.println(System.getProperty("user.dir"));
        Car cp=mp.readValue(new File("src/main/java/JACKSON_ObjectMapper/data.json"),Car.class);

        System.out.println(cp.getDoors());
        System.out.println(cp.getBrand());
    }

}
