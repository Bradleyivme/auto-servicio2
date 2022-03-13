package gt.edu.umg.progra3.colas;

public interface Cola {

    /**
     * emcola el item que se desea agregar
     * @param item
     * @return
     */
    void enqueue(String item);

    /**
     * desencola el item en turno
     * @return
     */
    String deque();
    /**
     * retorna el valor del elemento al inicio de la cola creada.
     * @return
     */
    String peek();

    /**
     * retorna el tamaño de la cola
     * @return
     */
    int size();

    /**
     * indica el tamaño de la cola
     * @return
     */
    boolean isEmpty();

    /**
     * indica si se encuentra vacía la cola
     * @return
     */
}
