package Files.JSONReadWrite;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class Company {
    private String company;
    private List<Employee> employees;
    private List<String> officeLocations;

    // Getters and setters
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }

    public List<String> getOfficeLocations() { return officeLocations; }
    public void setOfficeLocations(List<String> officeLocations) { this.officeLocations = officeLocations; }
}
