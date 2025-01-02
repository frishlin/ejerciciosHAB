/*
 Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
Cada trabajador se representa como un hilo independiente.
Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.
 */
package logica;

import java.util.ArrayList;
import java.util.List;


public class Fabrica {

    private List<String> listaTareas;
    private int numTarea;
    private boolean isActive = true;

    public Fabrica() {
        listaTareas = new ArrayList<>();
        numTarea = 1;
    }
    
    public synchronized void recibirTarea() {
        String tarea = "Tarea " + numTarea;
        listaTareas.add(tarea);
        System.out.println("tarea " + "ha sido añadida a la lista");
        numTarea++;
        notifyAll();
    }
    
    public synchronized String asignarTarea() {
        while(listaTareas.isEmpty()) {
            try {
                wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        return listaTareas.remove(0);
    }
    
    public synchronized boolean isActive() {
        return isActive;
    }
    
    /*public synchronized void shutdown() {
        isActive = false;
        notifyAll();
        System.out.println("La fábrica se ha cerrado");
    }*/

    public List<String> getListaTareas() {
        return listaTareas;
    }

    
    public int getNumTarea() {
        return numTarea;
    }
    
}
