package zzz;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerificadorParTest {
    @Test
    @DisplayName("1")
    public void espar(){
        assertTrue(VerificadorPar.esPar(4));
    }
    @Test
    @DisplayName("2")
    public void impar(){
        assertFalse(VerificadorPar.esPar(3));
    }

}
