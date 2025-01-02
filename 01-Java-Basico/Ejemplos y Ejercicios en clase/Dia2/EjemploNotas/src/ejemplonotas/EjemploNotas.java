/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplonotas;

import java.util.Scanner;

/**
 *
 * @author Sol
 */
public class EjemploNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa la nota del alumno_ ");
        Scanner teclado = new Scanner(System.in);
        double calificacion = teclado.nextDouble();
        
        if(calificacion < 60){
            System.out.println("El rendimiento del alumno es Insuficiente");
        } else {
            if(calificacion >= 60 && calificacion <= 80) {
                System.out.println("El rendimiento del alumno es Bueno");
            } else if(calificacion > 80 && calificacion <= 90 ){
                System.out.println("El rendimiento del alumno es Notable");
                } else {
                    System.out.println("El rendimiento es Excelente");
                }
            }
        }
    }
    
}
