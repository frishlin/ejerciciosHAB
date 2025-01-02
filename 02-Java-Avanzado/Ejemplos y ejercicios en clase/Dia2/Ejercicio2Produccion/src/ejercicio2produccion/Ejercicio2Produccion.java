/*
Ejercicio Nº 2 - Simulación de cadena de producción
Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden realizar tareas concurrentemente.
Cada trabajador se representa como un hilo independiente.
Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y embalar productos.
Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de trabajo de la fábrica.
Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de coordinación entre las tareas.
 */
package ejercicio2produccion;

import logica.Fabrica;
import logica.Trabajador;

public class Ejercicio2Produccion {

    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        
        Trabajador trab1 = new Trabajador("Pepe", "Pecas", fabrica);
        Trabajador trab2 = new Trabajador("Mario", "Moreno", fabrica);
        Trabajador trab3 = new Trabajador("Gaspar", "Enaine", fabrica);
        
        trab1.start();
        trab2.start();
        trab3.start();
        
        for(int i = 0; i < 10; i++) {
            fabrica.recibirTarea();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //finalizar hilos
    //fabrica.shutdown();
}
