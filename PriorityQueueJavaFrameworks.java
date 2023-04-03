/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
import java.util.PriorityQueue;
public class PriorityQueueJavaFrameworks<E extends Comparable<E>> implements IPriorityQueue<E> {

    protected PriorityQueue<E> datos;

    /**
     * Constructor de la cola de prioridad basada en PriorityQueue.
     * Crea una nueva cola de prioridad vacía.
     */
    public PriorityQueueJavaFrameworks(){
        datos = new PriorityQueue<E>();
    }

    /**
     * Agrega un elemento a la cola de prioridad.
     * @param element el elemento a agregar.
     */
    public void add(E element){
        datos.add(element);
    }

    /**
     * Verifica si la cola de prioridad está vacía.
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    /**
     * Devuelve el número de elementos en la cola de prioridad.
     * @return el número de elementos en la cola de prioridad.
     */
    @Override
    public int size() {
        return datos.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    @Override
    public void clear() {
        datos.clear();
    }

    /**
     * Devuelve el primer elemento de la cola de prioridad sin eliminarlo.
     * @return el primer elemento de la cola de prioridad, o null si la cola de prioridad está vacía.
     */
    @Override
    public E getFirst() {
        return datos.peek();
    }

    /**
     * Elimina y devuelve el primer elemento de la cola de prioridad.
     * @return el primer elemento de la cola de prioridad, o null si la cola de prioridad está vacía.
     */
    public E remove(){
        return datos.remove();
    }


}
