/*
 Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores 
pueden realizar tareas concurrentemente.
Cada trabajador se representa como un hilo independiente.
Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.   
 */
package logica;

public class Trabajador extends Thread {
    private String nombre;
    private String apellido;
    private Fabrica fabrica;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, Fabrica fabrica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fabrica = fabrica;
    }
    
    @Override
    public void run() {
        while (fabrica.isActive()) {
            String tarea = fabrica.asignarTarea();
            
            System.out.println(nombre + " " + apellido + " está atendiendo en " + tarea);
            System.out.println("ensamblando productos");
            System.out.println("controlando productos");
            System.out.println("embalando productos");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) { // Espacio corregido aquí
                e.printStackTrace();
            }
            System.out.println(nombre + " " + apellido + " ha completado " + tarea);
        }
    }
}
