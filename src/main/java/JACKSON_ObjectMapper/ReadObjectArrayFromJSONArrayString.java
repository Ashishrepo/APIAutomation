package JACKSON_ObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ReadObjectArrayFromJSONArrayString {


    public static void main(String[] args) throws IOException {


        ObjectMapper mp = new ObjectMapper();

        Car[] car = mp.readValue(new File("src/main/java/JACKSON_ObjectMapper/dataArray.json"), Car[].class);



    }
}
