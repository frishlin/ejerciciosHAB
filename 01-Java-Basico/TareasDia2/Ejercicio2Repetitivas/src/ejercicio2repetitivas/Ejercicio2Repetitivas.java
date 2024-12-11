/*
 Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
 Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
 Luego, muestra el total de la compra que debe abonar.
 Pista: Recuerda que existen dos tipos de bucles, los controlados por un contador (cuando sabemos un número exacto de productos por ejemplo) 
 o por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”. 
 Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
 */
package ejercicio2repetitivas;

import java.util.Scanner;

public class Ejercicio2Repetitivas {

    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("--- EL SUPERMERCADO ---");
        System.out.println("");
        System.out.println("***** Este programa finaliza ingresando el número 0 o un número negativo *****");
        System.out.println("");

        double precio;
        double sumatoria = 0.0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el precio del producto: ");
        precio = teclado.nextDouble();
        
        while(precio > 0) {
            sumatoria += precio;
            
            System.out.print("Ingresa el precio del producto: ");
            precio = teclado.nextDouble();
        }
        
        System.out.println("El total a pagar es de: " + sumatoria);

    }
}    
