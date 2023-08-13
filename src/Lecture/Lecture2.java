package Lecture;

public class Lecture2 {
    public static void main(String[] args) {
        int lancers = 120;
        int doppelsoldner = 30;
        int leutenants = 2;
        int capitans = 1;

        int baseSalary = 4;
        int lancerSalary = baseSalary;
        int doppelSalary = 2 * lancerSalary;
        System.out.println("Total salary:  ");
        System.out.println(lancers * lancerSalary +
                doppelsoldner * doppelSalary +
                leutenants * 10 * baseSalary +
                capitans * 100 * baseSalary);
    }
}
