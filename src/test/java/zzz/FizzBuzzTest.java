package zzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    @DisplayName("1")
    public void test1(){
        FizzBuzz game = new FizzBuzz();
        List<String> numeroLista = game.getNumbers();
        assertEquals("1",numeroLista.get(0),"Esto nos da el numero de la lista");
        assertEquals("2",numeroLista.get(1));
        assertEquals("6",numeroLista.get(5));
        assertEquals("13",numeroLista.get(12));
    }
}
