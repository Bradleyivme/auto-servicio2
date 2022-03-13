package gt.edu.umg.progra3.colas;

public class AutoServicio {

    private ImplementoCola colas;

    public AutoServicio(ImplementoCola colas) {
        this.colas = colas;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */

    //Nota: Primer elemento que entra es el primero en salir.
    public String ingresarAuto(String placa){
        //Agrega un auto a la cola
        colas.enqueue(placa);
        return null;
    }

    public String proximoAuto(){
        //Inspeccionar la cabeza de la cola, devolviendo
        //la cabeza de la cola sin eliminarla.
        return colas.peek();
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
        //Enregar auto y eliminar su valor de la cola
        return colas.deque();
    }

    public int obtenerAutosEnCola(){
        //Retornar el tamaño de la cola
        return colas.size();
    }
}
