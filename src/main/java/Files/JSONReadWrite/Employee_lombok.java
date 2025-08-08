package Files.JSONReadWrite;

import lombok.Data;

import java.util.List;

@Data
public class Employee_lombok {
    private int id;
    private String name;
    private String role;
    private List<String> skills;


}
