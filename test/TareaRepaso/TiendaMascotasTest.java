package TareaRepaso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TiendaMascotasTest {

    @Test
    void agregarMascota() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Lucia", 3, "Perro");
        assertEquals(0, tienda.cantidadMascotas);
    }

    @Test
    void venderMascota() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Lucia", 3, "Perro");
        tienda.venderMascota("Lucia");
        assertEquals(0, tienda.cantidadMascotas);
    }

    @Test
    void mostrarInventario() {
        TiendaMascotas tienda = new TiendaMascotas();
        tienda.agregarMascota("Lucia", 3, "Perro");
        tienda.venderMascota("Lucia");
        tienda.mostrarInventario();
        assertEquals(0, tienda.cantidadMascotas);
    }
}