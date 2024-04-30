package zzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContadorTest {
    @Test
    @DisplayName("obtenerValor")
    public void obtenerValor(){
        Contador contador = new Contador();
        assertEquals(0,contador.obtenerValor());
    }
    @Test
    @DisplayName("2")
    public void incrementar(){
        Contador contador = new Contador();
        contador.incrementar();
        assertEquals(1,contador.obtenerValor());
    }
    @Test
    @DisplayName("3")
    public void descrementar(){
        Contador contador = new Contador();
        contador.decrementar();
        assertEquals(0,contador.obtenerValor());
    }
}
