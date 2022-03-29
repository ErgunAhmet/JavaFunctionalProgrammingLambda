package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class _FunctionExample {
    public static void main(String args[]){
        Function<Employee, String> funcEmpToString= e -> e.getName();
        List<Employee> employeeList=
                Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

        List<String> empNameList=convertEmpListToNamesList(employeeList, funcEmpToString);

        empNameList.forEach((names) -> System.out.println(names));
    }

    public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
        List<String> empNameList= new ArrayList<>();
        for(Employee emp: employeeList){
            empNameList.add(funcEmpToString.apply(emp));
        }
        return empNameList;
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
