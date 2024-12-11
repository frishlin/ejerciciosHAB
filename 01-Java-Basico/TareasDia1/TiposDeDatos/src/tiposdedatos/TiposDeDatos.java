
package tiposdedatos;

import java.util.Scanner;

public class TiposDeDatos {

    public static void main(String[] args) {
        //tipo de dato + nombre de la variable
        int edad = 42;
        String nombre = "Marisol";
        boolean bandera = true;
        double estatura = 1.66;
        
        System.out.println("Mi nombre es: " + nombre + ", tengo " + edad + " años de edad" + ", mi estatura es " + estatura + " metros y me encuentro en estado " + bandera);
    
        // asignando tipos de datos que no corresponden
        
        /*int nombreGato = "Síkis";
        String estado = false;
        boolean edadGato = 11.5;
        double medidaGato = true;*/
        
        //LECTURA - SCANNER
        
        Scanner teclado  = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nuevoNombre = teclado.next(); 
        System.out.println("Tu nombre es: " + nuevoNombre);
        
        System.out.println("Ingresa la edad: ");
        int nuevaEdad = teclado.nextInt();
        System.out.println("Tu edad es: " + nuevaEdad);
        
        System.out.println("Ingresa la estatura: ");
        double nuevaEstatura = teclado.nextDouble();
        System.out.println("Tu estatura es: " + nuevaEstatura);
    }
}
