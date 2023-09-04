package hw.hw7;

public class Salary {
    static int getSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            sum = sum + employees[i].salary;
        }
        return sum;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Jessica Smith";
        employee1.age = 20;
        employee1.sex = false;
        employee1.salary = 100;

        Employee employee2 = new Employee();
        employee2.name = "John";
        employee2.age = 21;
        employee2.sex = true;
        employee2.salary = 200;

        Employee[] employees = new Employee[]{employee1, employee2};

        System.out.println(Salary.getSum(employees));
    }
}
