package zzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraImpuestosTest {
    @Test
    @DisplayName("CalcularIVA")
    public void testCalcularIVA_TasaNormal() {
        double tasaIVA = 0.16; // Supongamos una tasa del 16%
        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos(tasaIVA);
        double monto = 100.0;
        double resultadoEsperado = 16.0; // 16% de 100
        assertEquals(resultadoEsperado, calculadoraImpuestos.calcularIVA(monto), 0.001); // Tolerancia de 0.001
    }
}
