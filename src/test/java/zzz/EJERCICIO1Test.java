package zzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EJERCICIO1Test {
    @Test
    public void testCalculateCostPerStudent_100OrMoreStudents() {
        assertEquals(65.0, EJERCICIO1.calculateCostPerStudent(100));
        assertEquals(65.0, EJERCICIO1.calculateCostPerStudent(150));
    }

    @Test
    public void testCalculateCostPerStudent_50To99Students() {
        assertEquals(70.0, EJERCICIO1.calculateCostPerStudent(50));
        assertEquals(70.0, EJERCICIO1.calculateCostPerStudent(99));
    }

    @Test
    public void testCalculateCostPerStudent_30To49Students() {
        assertEquals(95.0, EJERCICIO1.calculateCostPerStudent(30));
        assertEquals(95.0, EJERCICIO1.calculateCostPerStudent(49));
    }

    @Test
    public void testCalculateCostPerStudent_LessThan30Students() {
        assertEquals(133.33333333333334, EJERCICIO1.calculateCostPerStudent(27), 0.0001);
        assertEquals(200.0, EJERCICIO1.calculateCostPerStudent(20), 0.0001);
    }

    @Test
    public void testCalculateTotalCost() {
        assertEquals(6500.0, EJERCICIO1.calculateTotalCost(100));
        assertEquals(7000.0, EJERCICIO1.calculateTotalCost(50));
        assertEquals(3800.0, EJERCICIO1.calculateTotalCost(40));
        assertEquals(2000.0, EJERCICIO1.calculateTotalCost(20));
    }
}
