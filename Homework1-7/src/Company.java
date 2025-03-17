import java.util.ArrayList;
import java.util.List;

public class Company {
    String name;
    List<Employee> employees;
    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }
    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        if(employees.contains(employee)) {
            employees.remove(employee);
        }
        else {
            System.out.println("Employee not found");
        }
    }

    public void moveEmployeeToCompany(Employee employee, Company company) {
        removeEmployee(employee);
        company.addEmployee(employee);
    }

    public void displayAddressOfEveryEmployee() {
        System.out.println("Name: " + name);
        for(Employee e : employees) {
            System.out.println(e);
        }
    }
}
