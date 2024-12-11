
package ejercicioclasificacion;

import java.util.Scanner;

public class EjercicioClasificacion {

    public static void main(String[] args) {
        
        System.out.println("Ingresa el precio del artículo: ");
        Scanner teclado = new Scanner(System.in);
        int precio = teclado.nextInt();
        
        if(precio < 50) {
            System.out.println("El artículo va en la clasificación Económico");
        } else if(precio >=50 && precio < 100) {
            System.out.println("El artículo va en la clsaificación Accesible");
        } else if(precio >= 100 && precio <= 200){
            System.out.println("El artículo va en la clasificación Estándar");
        } else {
            System.out.println("El artículo va en la clasificación Premium");
        }

    }
    
}
