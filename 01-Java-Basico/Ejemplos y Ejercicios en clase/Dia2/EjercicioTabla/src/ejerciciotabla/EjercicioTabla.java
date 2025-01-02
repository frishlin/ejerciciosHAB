/*
Escribe un programa que permita al usuario ingresar un número entero positivo y 
luego imprima la tabla de multiplicar de ese número del 1 al 10.
*/
package ejerciciotabla;

import java.util.Scanner;

public class EjercicioTabla {

    public static void main(String[] args) {
        
        System.out.println("---- Tabla de multiplicar de un número ----");
        System.out.print("Ingresa un número entero positivo: ");
                     
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        if(numero <= 0){
           System.out.println("El número ingresado está fuera de rango");
        }
        
        while(numero <= 0) {
            System.out.print("Ingresa un número entero positivo: ");
            numero = teclado.nextInt();
            
            if(numero <= 0){
                System.out.println("El número ingresado está fuera de rango");
            }
        }
        
        for(int cont = 1; cont <= 10; cont++) {
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
        }
    }
    
}
