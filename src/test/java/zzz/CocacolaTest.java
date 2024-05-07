package zzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;


public class CocacolaTest {
    @Test
    @DisplayName("1")
    public void sumar(){
        Cocacola cocacola = new Cocacola();
        assertEquals(5,cocacola.sumar(2,3));
    }
    @Test
    @DisplayName("2")
    public void restar(){
        Cocacola cocacola =new Cocacola();
        assertEquals(2,cocacola.restar(5,3));
    }
    @Test
    @DisplayName("3")
    public void dividir(){
        Cocacola cocacola = new Cocacola();
        assertEquals(5,cocacola.dividir(10,2));
    }
    @Test
    @DisplayName("4")
    public void multiplicar(){
        Cocacola cocacola = new Cocacola();
        assertEquals(15,cocacola.multiplicar(5,3));
    }
}
