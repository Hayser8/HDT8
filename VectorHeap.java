/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {

    private Vector<E> data;
    /**
     * Crea una nueva cola de prioridad vacía.
     */
    public VectorHeap() {
        data = new Vector<>();
    }
    /**
     * Crea una nueva cola de prioridad a partir de un vector de elementos.
     * 
     * @param v el vector de elementos a partir del cual se crea la cola de prioridad
     */
    public VectorHeap(Vector<E> v) {
        data = new Vector<>(v);
        heapify();
    }
    /**
     * Organiza los elementos del vector para que se cumpla la propiedad de heap, 
     * utilizando el algoritmo pushDown.
     */
    private void heapify() {
        for (int i = parent(size() - 1); i >= 0; i--) {
            pushDown(i);
        }
    }
    /**
     * Agrega un elemento a la cola de prioridad y lo acomoda en la posición
     * correcta utilizando el algoritmo percolateUp.
     * 
     * @param value el elemento a agregar a la cola de prioridad
     */
    @Override
    public void add(E value) {
        data.add(value);
        percolateUp(size() - 1);
    }
    /**
     * Acomoda un elemento en la posición correcta dentro de la cola de prioridad 
     * utilizando el algoritmo percolateUp.
     * 
     * @param leaf la posición del elemento a acomodar en la cola de prioridad
     */
    private void percolateUp(int leaf) {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && value.compareTo(data.get(parent)) < 0) {
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }
    /**
     * Remueve y devuelve el elemento de mayor prioridad de la cola de prioridad.
     * 
     * @return el elemento de mayor prioridad en la cola de prioridad
     */
    @Override
    public E remove() {
        E minVal = getFirst();
        data.set(0, data.get(size() - 1));
        data.setSize(size() - 1);
        if (size() > 1) {
            pushDown(0);
        }
        return minVal;
    }
    /**
     * Acomoda un elemento en la posición correcta dentro de la cola de prioridad 
     * utilizando el algoritmo pushDown.
     * 
     * @param root la posición del elemento a acomodar en la cola de prioridad
     */
    private void pushDown(int root) {
        E value = data.get(root);
        int heapSize = size();
        while (root < heapSize) {
            int childPos = left(root);
            if (childPos < heapSize - 1 && data.get(childPos + 1).compareTo(data.get(childPos)) < 0) {
                childPos++;
            }
            if (childPos < heapSize && data.get(childPos).compareTo(value) < 0) {
                data.set(root, data.get(childPos));
                root = childPos;
            } else {
                data.set(root, value);
                return;
            }
        }
    }
    /**
     * Obtiene el elemento con mayor prioridad del VectorHeap sin removerlo
     * @return el elemento con mayor prioridad o null si el VectorHeap está vacío
     */
    @Override
    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return data.get(0);
    }
    /**
     * Verifica si el VectorHeap está vacío
     * @return true si el VectorHeap está vacío, false de lo contrario
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * Obtiene el número de elementos del VectorHeap
     * @return el número de elementos del VectorHeap
     */
    @Override
    public int size() {
        return data.size();
    }
    /**
     * Obtiene el índice del padre de un elemento en el VectorHeap
     * @param i el índice del elemento hijo
     * @return el índice del padre del elemento
     */
    private static int parent(int i) {
        return (i - 1) / 2;
    }
    /**
     * Obtiene el índice del hijo izquierdo de un elemento en el VectorHeap
     * @param i el índice del elemento padre
     * @return el índice del hijo izquierdo del elemento
    */ 
    private static int left(int i) {
        return 2 * i + 1;
    }
    /**
     * Obtiene el índice del hijo derecho de un elemento en el VectorHeap
     * @param i el índice del elemento padre
     * @return el índice del hijo derecho del elemento
     */
    private static int right(int i) {
        return 2 * i + 2;
    }
    /**
     * Remueve todos los elementos del VectorHeap
     */
    @Override
    public void clear() {
        data.clear();
    }
}
