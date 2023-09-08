package hw.hw8;

public class EmployeeUtils {

    public Employee findByName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
}
