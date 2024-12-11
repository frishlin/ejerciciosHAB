
/*Escribe un programa que permita al usuario ingresar números positivos y vaya acumulando la suma de estos. 
El programa debe detenerse cuando el usuario ingrese un número negativo, 
y en ese momento debe mostrar la suma total de los números positivos ingresados.*/

package ejerciciopositivos;

import java.util.Scanner;


public class EjercicioPositivos {

   
    public static void main(String[] args) {

        int total = 0;
        System.out.println("---- Ingresa números positivos y detén ingresando un número negativo ----");
        System.out.print("Ingresa un número: ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        while(numero >= 0){
            total += numero;
            System.out.print("Ingresa un número: ");
            numero = teclado.nextInt();
            
        }
        System.out.println("La suma de los números positivos ingresados es: " + total);
    }
    
}
