package Files.JSONReadWrite;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company_Lombok {
    private String company;
    private List<Employee> employees;
    private List<String> officeLocations;


}
