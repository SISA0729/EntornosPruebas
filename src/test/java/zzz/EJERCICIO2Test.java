package zzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EJERCICIO2Test {
    @Test
    @DisplayName("1")
    public void getHouseMeaning(){
        assertEquals("valentía",EJERCICIO2.getHouseMeaning("gryffindor"));
    }
    @Test
    @DisplayName("2")
    public void gethouse(){
        assertEquals("lealtad",EJERCICIO2.getHouseMeaning("hufflepuff"));
    }
}
