/*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada
c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
*/
package ejercicio2dia3poo;

import java.util.Scanner;
import logica.Persona;

public class Ejercicio2Dia3Poo {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //a) crear vector para almacenar a 5 personas
        Persona personas[] = new Persona[5];
        
        System.out.println("\nSistema de Registro de 5 Personas\n");

        for(int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            System.out.println("---------------------------------------------------");
            System.out.println("Ingresa los datos de la persona " + (i + 1) + ": ");
            
            boolean idRepetido = true;
            while(idRepetido) {
                System.out.print("Ingresa el id: ");
                int id = teclado.nextInt();
                teclado.nextLine();
                idRepetido = false;
                int j = 0;
                while(j < i && idRepetido == false) {
                    if(personas[j].getId() == id) {
                        idRepetido = true;
                        System.out.print("¡El Id ingresado ya existe, favor de ingresar otro!\n");
                    }
                    j++;
                }
                personas[i].setId(id);
            }

            System.out.print("Ingresa el nombre: ");
            personas[i].setNombre(teclado.nextLine());
            System.out.print("Ingresa la edad: ");
            personas[i].setEdad(teclado.nextInt());
            teclado.nextLine();
            System.out.print("Ingresa la dirección: ");
            personas[i].setDireccion(teclado.nextLine());
            System.out.print("Ingresa el número telefónico: ");
            personas[i].setTelefono(teclado.nextLine());
        }
        
        //b) Recorrer el vector y mostrar por pantalla nombre y edad de cada persona almacenada
        
        System.out.println("\nDatos de personas registradas ANTES de los cambios");
        mostrarRegistros(personas);

        
        //c)Cambiar el nombre de 2 personas
        
        boolean cambios = true;
        int contadorCambios = 0;
        while(cambios) {
            System.out.print("\nIngresa número de la persona (1 al 5) cuyo nombre deseas corregir:  ");
            int numero = teclado.nextInt();
            
            if(numero < 1 || numero >5) {
                System.out.println("El número ingresado no es válido, favor de ingresar números del 1 al 5:  ");
            }else {
                int indice = numero - 1;
                System.out.println("El nombre de la persona a modificar es: " + personas[indice].getNombre());
                System.out.print("Ingresa el nuevo nombre: ");
                teclado.nextLine();
                String nuevoNombre = teclado.nextLine();
                
                personas[indice].setNombre(nuevoNombre);
                contadorCambios++;
            }
            
            if(contadorCambios == 2) {
                cambios = false;
                System.out.println("¡Has llegado al límite de cambios!");
            }
            
        }
        System.out.println("Datos de personas registradas DESPUÉS de los cambios");
        mostrarRegistros(personas);       
        
       //d) Recorrer el vector y mostrar únicamente a las personas mayores de 30 años
       
        int contadorEdades = buscarEdades(personas);

        
        System.out.println("---------------------------------------------------");
        System.out.println("\nPersonas mayores a 30 años (" + contadorEdades + " encontrada(s))");
        System.out.println("---------------------------------------------------");

        for(int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() > 30) {
                System.out.println(personas[i].getNombre() + " con " + personas[i].getEdad() + " años");
            }
        }
        System.out.println("");
    }
    
    public static void mostrarRegistros(Persona[] personas) {
        for(int i = 0; i < personas.length; i++) {
            System.out.println("---------------------------------------------------");
            System.out.println("Datos de la persona " + (i + 1) + ": ");
            System.out.println("Nombre: " + personas[i].getNombre() + "\nEdad: " + personas[i].getEdad());
        }
    }
    
    public static int buscarEdades(Persona[] personas) {
        int contadorEdades = 0;
        for(int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() > 30) {
                contadorEdades++;
            }
        }
        return contadorEdades;
    }
    
}
