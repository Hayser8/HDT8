/**
* Tarea: Hoja de trabajo 8
* Autores: Julio García Salas, Joaquín Campos
* Fecha: 1/04/2023
*/
public interface IPriorityQueue<E extends Comparable<E>>
{
	/*
	Método que devuelve el primer elemento de la cola de prioridad, sin eliminarlo.
	@return el primer elemento de la cola de prioridad.
	*/
	public E getFirst();
	/**
	Método que elimina y devuelve el primer elemento de la cola de prioridad.
	@return el primer elemento de la cola de prioridad.
	*/
	public E remove();
	/**
	Método que agrega un elemento a la cola de prioridad.
	@param value el elemento a agregar.
	*/
	public void add(E value);
	/**
	Método que indica si la cola de prioridad está vacía.
	@return true si la cola de prioridad está vacía, false en caso contrario.
	*/
	public boolean isEmpty();
	/**
	Método que devuelve el número de elementos en la cola de prioridad.
	@return el número de elementos en la cola de prioridad.
	*/
	public int size();
	/**
	Método que vacía la cola de prioridad.
	*/
	public void clear();

}