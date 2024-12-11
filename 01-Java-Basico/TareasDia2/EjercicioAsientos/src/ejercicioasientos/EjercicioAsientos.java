/*
Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. 
Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento 
(por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. 
¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
 */

package ejercicioasientos;

import java.util.Scanner;

public class EjercicioAsientos {

    public static void main(String[] args) {

        int disponible = 4;
        int salir = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("--- RESERVA DE ASIENTOS ---");

        //Configurando asientos vacíos
        String[][] asientos = new String[2][2];
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                asientos[i][j] = "O";
            }
        }
        System.out.println("");
        
        //Imprime asientos vacíos
        for (int i = 0; i < asientos.length; i++) {
            System.out.print("Fila " + (i+1) + " |  ");
            for (int j = 0; j < asientos.length; j++) {               
                System.out.print(asientos[i][j] + "\t");         
            }
            System.out.println("");
        }
        System.out.println("");
        
        while(disponible != 0  && salir == 1) {
        
            //Solicita fila y columna
            System.out.print("Dame la fila (Solo números del 1 al 5): ");
            int fila = teclado.nextInt();

            System.out.print("Dame la columna (Solo números del 1 al 5): ");
            int columna = teclado.nextInt();
            teclado.nextLine();

            if(fila <= 0 || fila > 5 || columna <= 0 || columna > 5) {
                System.out.println("0");
                System.out.println("¡Este asiento no existe!");
            }else if(asientos[fila-1][columna-1].equals("X")){
                System.out.println("");
                System.out.println("¡Este asiento ya se encuentra ocupado!");
            } else{
                //Asigna el valor de "X" a la posición de fila - 1 y columna - 1
                System.out.println("");
                asientos[fila - 1][columna - 1] = "X";
                disponible--;
                
                //Imprime asientos con la reserva
                for (int i = 0; i < asientos.length; i++) {
                    System.out.print("Fila " + (i+1) + " |  ");
                    for (int j = 0; j < asientos.length; j++) {
                        System.out.print(asientos[i][j] + "\t");
                    }
                    System.out.println("");
                    
                    
                }
                
                
            }

            System.out.println("");
            if(disponible == 0) {
                System.out.println("¡Ya no hay asientos disponibles!");    
            } else {
                System.out.print("¿Deseas seguir reservando asientos? 1 para sí, -1 para no : ");
                salir = teclado.nextInt();
            }
        }
        System.out.println("");
        System.out.println("¡Gracias por usar el sistema!");    
            
    }
        
}
   
