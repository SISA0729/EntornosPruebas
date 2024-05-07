package ejerciciosIdentificador.ejercicio1;

import ejerciciosIdentificador.ejercicio1.ComprobarIdentificador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ComprobarIdentificadorTest {

 @Test
    void testValidarIdentificador() {
        ComprobarIdentificador ci = new ComprobarIdentificador();

        ci.setIdentificador("valid-id1");
        assertTrue(ci.validarIdentificador());

        ci.setIdentificador("invalid-id-");
        assertFalse(ci.validarIdentificador());

        ci.setIdentificador("int");
        assertFalse(ci.validarIdentificador());

        ci.setIdentificador("12345");
        assertFalse(ci.validarIdentificador());

        ci.setIdentificador("verylongidentifiernameexceedinglimit");
        assertFalse(ci.validarIdentificador());
    }

}
