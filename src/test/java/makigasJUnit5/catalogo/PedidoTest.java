package makigasJUnit5.catalogo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Pedido con 0 a productos")
    void testCantidad1() {

        Pedido p = new Pedido();

        System.out.println("Prueba antes de meter productos");
        assertEquals(0,p.cantidad());
    }

    @Test
    @DisplayName("Pedido con 1 producto")
    void testCantidad2() {

        Producto p1 = new Producto("Coco",400);

        Pedido p = new Pedido();

        p.agregar(p1);
        assertEquals(1,p.cantidad());

    }

    @Test
    @DisplayName("Pedido con 2 producto")
    void testCantidad3() {

        Producto p1 = new Producto("Coco",400);
        Producto p2 = new Producto("Candela",200);

        Pedido p = new Pedido();

        p.agregar(p1);
        p.agregar(p2);

        assertEquals(2,p.cantidad());

    }

    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }
}