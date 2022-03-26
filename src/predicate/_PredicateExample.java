package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _PredicateExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tim", "coder"));
        employees.add(new Employee("Simon", "hr"));
        employees.add(new Employee("John", "manager"));
        employees.add(new Employee("Derek", "ceo"));

        List managers = filter(employees, e -> e.getRoles().equals("manager"));
        System.out.println(managers);
    }

    public static List<Employee> filter(List<Employee> list, Predicate<Employee> predicate) {
        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee: list) {
            if (predicate.test(employee)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}
class Employee {
    private String name;
    private String roles;

    public Employee(String name, String roles) {
        this.name = name;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public String getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
