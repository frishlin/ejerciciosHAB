/*
    En una tabla de 4 filas por 4 columnas, se guardan las notas de 4 alumnos de secundaria.
    Cada fila corresopnde a las notas y al promedio de cada alumno.
    
    Se necesita un programa que permita a un profesor, cargar en las 3 primeras posiciones
    de cada fila, las notas del alumno y que en la última columna, se calculen los promedios.

    Una vez realizados los cálculos, se dese mostrar las 3 notas de cada alumno y el promedio
    correspondiente recorriendo la matriz.

*/
package ejerciciomatriz;

import java.util.Scanner;

public class EjercicioMatriz {

    public static void main(String[] args) {
        double notas[][] = new double[4][4];
        
        System.out.println("Ingreso de calificaciones y cálculo de promedio");
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas.length-1; j++) {
                System.out.print("Ingresa la nota " + (j+1) + " del alumno " + (i+1) + ": ");
                notas[i][j] = teclado.nextDouble();
            }
            
        }
        
        System.out.println();
        
        for(int i = 0; i < notas.length; i++){
            double suma = 0;
            for(int j = 0; j < notas.length-1; j++){
                System.out.print(notas[i][j] + "\t");
                suma += notas[i][j];                      
            }
            notas[i][3] = suma / 3;
            System.out.println(notas[i][3]);
        }
   
    }
    
}
