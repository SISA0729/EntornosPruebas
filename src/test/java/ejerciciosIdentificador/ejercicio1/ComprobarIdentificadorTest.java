package ejerciciosIdentificador.ejercicio1;

import ejerciciosIdentificador.ejercicio1.ComprobarIdentificador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ComprobarIdentificadorTest {
    @Test
    @DisplayName("Cobertura 1 - longitud <= 4")
    void validarIdentificador2(){
        cID.setIdentificador("Prog");
        assertFalse(cID.validarIdentificador());
    }
    @Test
    @DisplayName("Cobertura 3 - longitud >= 16")
    void validarIdentificador3(){
        cID.setIdentificador("Progra--mador-112");
        assertFalse(cID.validarIdentificador());
    }
}
