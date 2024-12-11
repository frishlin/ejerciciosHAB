/*
 * a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, 
a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. 
El programa debe mostrar (según cada caso) un mensaje informando la situación.
 */
package ejercicio1condicional;

import java.util.Scanner;

public class Ejercicio1Condicional {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("--- CONTROL DE INGRESO ---");
        System.out.println("");
        System.out.print("Ingresa la edad de la persona: ");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        if(edad > 18) {
            System.out.println("¡Esta persona puede ingresar al evento!");
        } else {
            System.out.println("¡Esta persona no tiene permitido el acceso al evento!");
        }
        
    }
    
}
