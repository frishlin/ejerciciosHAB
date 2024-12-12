/*
Crear una clase llamada Fruta, que tenga los siguientes atributos: nombre, color, calorías, tipoCascara, esComestible 
(tener en cuenta todos sus atributos, constructores, métodos getters y setters).
- Pedirle al usuario por teclado que ingrese los datos de la fruta que quiera guardar.
- Mostrar por pantalla los datos de la fruta creada
- Cambiar un dato de la fruta
- Volver mostrar la fruta con los datos cambiados

 */
package ejemplofruta;

import java.util.Scanner;
import logica.Frutas;

/**
 *
 * @author Sol
 */
public class EjemploFruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Frutas fruta1 = new Frutas(); //cuando no se sabe qué valores se van a modificar

        //cargar datos
        System.out.println("Bienvenido al sistema de frutas");
        System.out.println("Ingresa los datos de la fruta que deseas guardar");

        System.out.print("Ingresa nombre de la fruta: ");
        fruta1.setNombre(teclado.nextLine());
        // ☝ esta línea equivale a hacer String nombreFruta = teclado.nextLine(); fruta1.setNombre(nombreFruta);

        System.out.print("Ingresa color de la fruta: ");
        fruta1.setColor(teclado.nextLine());

        System.out.print("Ingresa calorías de la fruta: ");
        //Si no funciona el Scanner, se puede hacer uno nuevo o resetearlo
        teclado = new Scanner(System.in);
        fruta1.setCalorias(teclado.nextDouble());

        System.out.print("Ingresa el tipo de cáscara: ");
        teclado = new Scanner(System.in);
        fruta1.setTipoCascara(teclado.nextLine());

        System.out.print("¿La fruta es comestible? Escribe 's' para sí o 'n' para no: ");
        teclado = new Scanner(System.in);
        String opcion = teclado.next();
        if (opcion.equals("s")) {
            fruta1.setEsComestible(true);
        } else {
            fruta1.setEsComestible(false);
        }

        //mostrar datos
        if (fruta1.isEsComestible() == true) {
            opcion = "si";
        } else {
            opcion = "no";
        }

        System.out.println("");
        System.out.println("La fruta cargada es: "
                + "Nombre: " + fruta1.getNombre() + " Color: " + fruta1.getColor()
                + " Calorías: " + fruta1.getCalorias() + " Tipo de cáscara: " + fruta1.getTipoCascara() + " ¿Es comestible?: " + opcion); //otra forma para que el usuario no vea un true o un false

        /*System.out.println("La fruta cargada es: " +
                "Nombre: " + fruta1.getNombre() + "Color: " + fruta1.getColor() + 
                "Calorías: " + fruta1.getCalorias() + "¿Es comestible?: " + fruta1.isEsComestible());*/
        System.out.println("");

        //otra forma de java para mostrar los atributos como string con toString
        //cambio de 65 a 25 calorías
        System.out.println(fruta1.toString());
        fruta1.setCalorias(25);
        System.out.println("Datos con modificación");

    }

}
