package dia2ejemploif;

import java.util.Scanner;

public class Dia2EjemploIf {
    public static void main(String[] args) {

        //Avisar si una persona es mayor de edad o no (18+)
        System.out.println("Ingresa tu edad: ");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        
        if(edad >= 18){
            System.out.println("¡Eres mayor de edad!");
        } else {
            System.out.println("Aun eres menor de edad");
        }
        System.out.println("Gracias por usar el sistema");
    }
    
}
