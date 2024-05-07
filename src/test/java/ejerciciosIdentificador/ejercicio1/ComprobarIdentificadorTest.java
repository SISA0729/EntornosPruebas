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
        assertTrue(ci.validarIdentificador(), "El identificador debería ser válido");

        ci.setIdentificador("invalid-id-");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por tener un guión al final");

        ci.setIdentificador("int");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por ser una palabra reservada");

        ci.setIdentificador("12345");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por no contener letras");

        ci.setIdentificador("verylongidentifiernameexceedinglimit");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por exceder la longitud máxima permitida");
    }

}
