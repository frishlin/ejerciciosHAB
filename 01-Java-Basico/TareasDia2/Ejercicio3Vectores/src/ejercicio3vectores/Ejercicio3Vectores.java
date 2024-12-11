/*
 Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
 Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. 
 Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
 */
package ejercicio3vectores;

import java.util.Scanner;

public class Ejercicio3Vectores {

    public static void main(String[] args) {
        double temperaturaMaxima[] = new double[7];
        double sumatoria = 0.0;
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < temperaturaMaxima.length; i++){
            System.out.print("Ingresa la temperatura máxima del día " + (i+1) + ": ");
            double temperatura = teclado.nextDouble();
            sumatoria += temperatura;
        }
        
        System.out.println("El promedio de temperaturas máximas es: " + sumatoria / temperaturaMaxima.length);
        
    }
    
}
