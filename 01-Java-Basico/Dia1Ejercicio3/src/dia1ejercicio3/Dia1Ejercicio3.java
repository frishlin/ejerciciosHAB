/*
Ejercicio Nº 3 - Variables y Operadores
Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. 
Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula.

*/

package dia1ejercicio3;

import java.util.Scanner;

public class Dia1Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        //double base;
        //double altura;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de la base: ");
        double base = teclado.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        double altura = teclado.nextDouble();
        area = (base * altura)/2;
        System.out.println("El área del triángulo es: " + area);
        
    }
    
}
