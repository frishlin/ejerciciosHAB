
import logica.Videojuego;

/*
Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, 
categoría (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
- Crear un vector de tipo VideoJuego que pueda almacenar 5 videojuegos. Crear 5 videojuegos y guardarlos en el vector.
- Recorrer el vector creado y mostrar por pantalla el titulo, consola y cantidad de jugadores de los videojuegos almacenados.
- Cambiar el nombre y la cantidad de jugadores de dos videojuegos. Mostrar por pantalla los datos de todos los videojuegos luego del cambio.
- Recorrer el vector y mostrar por pantalla únicamente a los videojuegos que sean de la consola “Nintendo 64”. En caso que no encuentre ninguno, informarlo también por pantalla. (editado) 
*/

import java.util.Scanner;

public class Videjuego {

    public static void main(String[] args) {
        Videojuego videojuegos[] = new Videojuego[5]; // Vector para 5 videojuegos
        Scanner teclado = new Scanner(System.in);

        // Creación de los videojuegos
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println("Ingresa los datos del videojuego " + (i + 1) + ": ");
            Videojuego videojuego = new Videojuego(); // Nuevo objeto para cada iteración

            System.out.print("Ingresa código: ");
            videojuego.setCodigo(teclado.nextLine());

            System.out.print("Ingresa título: ");
            videojuego.setTitulo(teclado.nextLine());

            System.out.print("Ingresa consola: ");
            videojuego.setConsola(teclado.nextLine());

            System.out.print("Ingresa cantidad de jugadores: ");
            videojuego.setCantidadJugadores(teclado.nextInt());
            teclado.nextLine(); // Consumir el salto de línea pendiente

            videojuegos[i] = videojuego;
        }

        System.out.println("");
        System.out.println("Colección de videojuegos: ");
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println("Videojuego " + (i + 1) + ": " + videojuegos[i].toString());
        }

        // CAMBIOS
        videojuegos[1].setTitulo("GTA V");
        videojuegos[1].setCantidadJugadores(2);

        videojuegos[3].setTitulo("Smash");
        videojuegos[3].setCantidadJugadores(6);

        // DESPUÉS
        System.out.println("");
        System.out.println("DESPUÉS:");
        for (int i = 0; i < videojuegos.length; i++) {
            System.out.println("Videojuego " + (i + 1) + ": " + videojuegos[i].toString());
        }

        // MOSTRAR LOS DE NINTENDO 64
        System.out.println("");
        System.out.println("Videojuegos para 'Nintendo 64':");
        boolean encontrado = false;
        for (int i = 0; i < videojuegos.length; i++) {
            if ("Nintendo 64".equals(videojuegos[i].getConsola())) {
                System.out.println(videojuegos[i].toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron videojuegos de la consola 'Nintendo 64'.");
        }
    }
}
