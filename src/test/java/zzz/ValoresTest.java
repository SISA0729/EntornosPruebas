package zzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class ValoresTest {
    @Test
    @DisplayName("Verificar obtenerValor con valor dentro del rango")
    public void test(){
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals( 5,Valores.obtenerValor());
    }
}
