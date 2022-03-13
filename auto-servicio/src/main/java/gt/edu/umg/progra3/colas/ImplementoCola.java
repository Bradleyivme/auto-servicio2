package gt.edu.umg.progra3.colas;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementoCola implements Cola{

    Queue<String> queue =new LinkedList<>();

    @Override
    public void enqueue(String item) {
        //Agregar un auto con placa a la cola
        queue.add(item);
    }

    @Override
    public String deque() {
        //Remover la cabeza de la cola
        return queue.remove();
    }

    @Override
    public String peek() {
        //Inspeccionar la cabeza de la cola, devolviendo
        //la cabeza de la cola sin eliminarla
        return queue.peek();
    }

    @Override
    public int size() {
        //Retornar el tamaño de la cola
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        //Retornar si se encuentra vacía
        //la cola con valor boolean
        return queue.isEmpty();
    }
}
