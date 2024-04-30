package zzz;

public class EJERCICIO1 {
    public static double calculateCostPerStudent(int numberOfStudents) {
        if (numberOfStudents >= 100) {
            return 65.0;
        } else if (numberOfStudents >= 50 && numberOfStudents <= 99) {
            return 70.0;
        } else if (numberOfStudents >= 30 && numberOfStudents <= 49) {
            return 95.0;
        } else {
            return 4000.0 / numberOfStudents;
        }
    }

    public static double calculateTotalCost(int numberOfStudents) {
        return numberOfStudents * calculateCostPerStudent(numberOfStudents);
    }
}
