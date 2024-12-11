/*
Ejercicio Nº 4 - Operaciones de Lectura
Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: 
suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.


Sugerencia: Compara los resultados que obtengas con otros compañeros. Pide a tus compañeros que te digan números al azar 
y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… 
¿De qué manera tratarías de evitar ésta situación?
 */
package dia1ejercicio4;

import java.util.Scanner;

public class Dia1Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer número: ");
        double numero1 = teclado.nextDouble();
        System.out.println("Dame el segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.println("La suma de estos números es: " + (numero1 + numero2));
        System.out.println("La resta de estos números es: " + (numero1 - numero2));
        System.out.println("La multiplicación de estos números es: " + (numero1 * numero2));
        System.out.println("La división de estos números es: " + (numero1 / numero2));

        //Si el segundo operando es 0, el resultado que muestra la consola es: Infinity
        //Tal vez se pueda arregar escribiendo una condición para que si el segundo número es 0, mande un mensaje de error al usuario.
    }

}
