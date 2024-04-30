package zzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class Caracteres10Test {
    @Test
    @DisplayName("1")
    public void obtenerCadena(){
        String input = "1234567890";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        String resultado = Caracteres10.obtenerCadena();
        assertEquals("1234567890",resultado);

    }

}
