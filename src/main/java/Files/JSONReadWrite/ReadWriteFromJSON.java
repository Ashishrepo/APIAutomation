package Files.JSONReadWrite;


import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadWriteFromJSON {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        String filePath=System.getProperty("user.dir")+"/src/main/java/Files/JSONReadWrite/data.json";
        Company_Lombok companyData = mapper.readValue(new File(filePath), Company_Lombok.class);

        System.out.println(companyData.getCompany());

        //loctions
          List<String> officeLocations= companyData.getOfficeLocations();
          officeLocations.forEach(System.out::println);

         // employee data
        List<Employee> employees = companyData.getEmployees();
        employees.forEach(e->{

            System.out.println(e.getId()+" "+e.getName()+ " "+e.getRole()+e.getSkills());
        });

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        // employee skills
        List<Employee> employees1 = companyData.getEmployees();
        for(Employee e:employees1){
            for(String skill :e.getSkills()){
                System.out.print(skill+ " - ");
            }

        }









    }
}
