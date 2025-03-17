

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Lalelelor","Constanta","Romania");
        Address address2 = new Address("Petre Ispirescu","Dolj","Romania");
        Address address3 = new Address("Romero","New York","USA");

        Employee employee1 = new Employee("Marian",address1);
        Employee employee2 = new Employee("Lorin",address2);
        Employee employee3 = new Employee("Adrian",address3);

        Company company1 = new Company("Hella");
        company1.addEmployee(employee1);
        company1.addEmployee(employee2);
        company1.addEmployee(employee3);

        Company company2 = new Company("Porsche");
        company1.moveEmployeeToCompany(employee1, company2);
        company2.displayAddressOfEveryEmployee();

        company1.displayAddressOfEveryEmployee();
    }
}
