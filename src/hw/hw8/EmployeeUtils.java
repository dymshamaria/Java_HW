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

    public Employee findBySubName(Employee[] employees, String substring) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e.getName().contains(substring)) {
                return e;
            }
        }
        return null;
    }


    public double getTotalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public double getMaxSalary(Employee[] employees) {
        double max = 0;
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i].getSalary();
            if (salary > max) {
                max = salary;
            }
        }
        return max;
    }

    public double getMinSalary(Employee[] employees) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i].getSalary();
            if (salary < min) {
                min = salary;
            }
        }
        return min;
    }

    public int getMinNumSubordinates(Manager[] managers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            int numOfSubordinates = managers[i].getNumberOfSubordinates();
            if (numOfSubordinates < min) {
                min = numOfSubordinates;
            }
        }
        return min;
    }

    public int getMaxNumSubordinates(Manager[] managers) {
        int max = 0;
        for (int i = 0; i < managers.length; i++) {
            int numOfSubordinates = managers[i].getNumberOfSubordinates();
            if (numOfSubordinates > max) {
                max = numOfSubordinates;
            }
        }
        return max;
    }

    public double getMaxBonus(Manager[] managers) {
        double max = 0;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double bonus = m.getSalary() - m.getBaseSalary();
            if (bonus > max) {
                max = bonus;
            }
        }
        return max;
    }

    public double getMinBonus(Manager[] managers) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            Manager m = managers[i];
            double bonus = m.getSalary() - m.getBaseSalary();
            if (bonus < min) {
                min = bonus;
            }
        }
        return min;
    }
}