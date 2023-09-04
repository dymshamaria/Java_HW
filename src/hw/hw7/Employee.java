package hw.hw7;

public class Employee {

    public String name;
    public int age;
    public boolean sex;
    public int salary;

    public boolean isSameName(Employee otherEmployee) {
        return this.equals(otherEmployee.name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Jessica Smith";
        employee1.age = 20;
        employee1.sex = false;

        Employee employee2 = new Employee();
        employee2.name = "John";
        employee2.age = 21;
        employee2.sex = true;

        System.out.println(employee1.isSameName(employee2));
    }
}
