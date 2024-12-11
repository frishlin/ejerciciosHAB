package EjercicioParque;

import java.util.Scanner;


public class EjemploParque {

   
    public static void main(String[] args) {
        
        int limPeso = 100;
        
        System.out.println("Ingresa el peso de la persona: ");
        Scanner teclado = new Scanner(System.in);
        int pesoPersona = teclado.nextInt();
        
        if(pesoPersona <= 100){
            System.out.println("¡Esta persona puede subir!");
        } else {
            int exceso = pesoPersona - limPeso;
            System.out.println("Esta persona excede el peso por " + exceso + " kilos");
        }
        System.out.println("Gracias por usar el sistema");
    }
        
}
    
