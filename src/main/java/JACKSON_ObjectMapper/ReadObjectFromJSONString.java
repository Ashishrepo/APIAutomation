package JACKSON_ObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.groovy.transform.SourceURIASTTransformation;

public class ReadObjectFromJSONString {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String carJson =
                "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

        Car car = objectMapper.readValue(carJson, Car.class);

        System.out.println(car.getBrand());
        System.out.println(car.getDoors());
    }
}
