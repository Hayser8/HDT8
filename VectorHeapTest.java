/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Vector;

public class VectorHeapTest {

    private VectorHeap<Integer> heap;

    @Before
    public void setUp() {
        heap = new VectorHeap<>();
    }

    @Test
    public void testAddAndRemove() {
        heap.add(5);
        heap.add(2);
        heap.add(8);
        heap.add(1);

        assertEquals(Integer.valueOf(1), heap.getFirst());
        assertEquals(Integer.valueOf(1), heap.remove());
        assertEquals(Integer.valueOf(2), heap.getFirst());
        assertEquals(Integer.valueOf(2), heap.remove());
        assertEquals(Integer.valueOf(5), heap.getFirst());
        assertEquals(Integer.valueOf(5), heap.remove());
        assertEquals(Integer.valueOf(8), heap.getFirst());
        assertEquals(Integer.valueOf(8), heap.remove());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testGetFirstVacio() {
        assertNull(heap.getFirst());
    }


}
