/*
    Realizar un programa que permita la carga de 15 números en un vector. 
    Una vez cargados, se necesita que el programa cuente e informe 
    por pantalla cuántas veces se cargó el número 7.
*/
package ejercicioarray;

import java.util.Scanner;

public class EjercicioArray {

    public static void main(String[] args) {
        
        int arreglo [] = new int[15];
        
        System.out.println("Ingresa los 15 números a guardar");
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < 15; i++){
            System.out.print("Ingresa el número del índice " + i + ": ");
            arreglo[i] = teclado.nextInt();
        }
        
        int cont = 0;
        for(int i = 0; i < 15; i++) {
            if(arreglo[i] == 7){
                cont ++;
            }
            
        }
        System.out.println("El número 7 fue cargado " + cont + " veces");
        
    }
    
}
