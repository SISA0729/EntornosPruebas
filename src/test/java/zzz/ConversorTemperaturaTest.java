package zzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {
    @Test
    @DisplayName("1")
    public void celsiusAFahrenheit(){
        assertEquals(32,ConversorTemperatura.celsiusAFahrenheit(0),0.01);
    }
    @Test
    @DisplayName("2")
    public void fahrenheitACelsius(){
        assertEquals(100,ConversorTemperatura.fahrenheitACelsius(212),0.01);
    }
}
