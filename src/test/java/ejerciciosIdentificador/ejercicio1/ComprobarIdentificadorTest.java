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

        // Test con un identificador válido
        ci.setIdentificador("valid-id1");
        assertTrue(ci.validarIdentificador(), "El identificador debería ser válido");

        // Test con un guión al final (inválido)
        ci.setIdentificador("invalid-id-");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por tener un guión al final");

        // Test con una palabra reservada (inválido)
        ci.setIdentificador("int");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por ser una palabra reservada");

        // Test sin letras, solo números (inválido)
        ci.setIdentificador("12345");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por no contener letras");

        // Test con un identificador demasiado largo (inválido)
        ci.setIdentificador("verylongidentifiernameexceedinglimit");
        assertFalse(ci.validarIdentificador(), "El identificador no debería ser válido por exceder la longitud máxima permitida");
    }

}
