package JACKSON_ObjectMapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ReadObjectListFromJSONArrayString {


    public static void main(String[] args) throws IOException {

        ObjectMapper mp = new ObjectMapper();

        List<Car> car = mp.readValue(new File("src/main/java/JACKSON_ObjectMapper/dataArray.json"), new TypeReference<List<Car>>(){});

        //all the items of jSON
       car.stream().forEach(f-> System.out.println(f.getBrand()+"->"+f.getDoors()));


       // print specific item using filter
        Car model=car.stream().filter(c -> c.getBrand().equalsIgnoreCase("john")).findFirst().orElseThrow(()->new RuntimeException("not found"));

        System.out.println(model.getDoors());

    }
}
