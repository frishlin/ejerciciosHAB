
package ejerciciomientras;

import java.util.Scanner;

public class EjercicioMientras {

    public static void main(String[] args) {
        
        //Contar de 0 a 10
        int cont = 0;
        
        //while - condición de parada - cierre
        while(cont <= 10) {
            System.out.println("Estoy en el númer:  " + cont);
            //cont = cont + 1;
            cont ++;
        }
        
        //ingreso de edades, para al encontrar edad > 70 (usando )
        
        System.out.print("Ingresa la edad: "); 
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        while(edad <= 70){
            System.out.print("Ingresa la edad: ");
            edad = teclado.nextInt();
        }
        
        System.out.println("¡La persona ha sido encontrada!");
    }
    
}
