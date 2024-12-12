
package ejemploclase;


import java.time.LocalDate;
import logica.Persona;


public class EjemploClase {

    public static void main(String[] args) {
        Persona personaSinAtributos = new Persona();  //llama al constructor de Persona vacío y crea la persona sin atributos
        //Para crear una persona con atributos (Ctrl + espacio, muestra las opciones de qué constructor agregar)
        
        Persona personaConAtributos = new Persona(1, "Olga", "Juárez", LocalDate.of(1982,03,06), "Centro");
    
    //Hacer uso del get - traer
    
    //Quiero ver por pantalla Nombre y Apellido
        System.out.println("--------ANTES DE SET");
        System.out.println("El nombre es: " + personaConAtributos.getNombre() + "\nEl apellido es: " + personaConAtributos.getApellido());
               
        
        //para set
        //si tengo un objeto vacío, permite asignar desde cero y si hay, permite reemplazar
        personaConAtributos.setApellido("Benitez");
        
        System.out.println("--------DESPUÉS DE SET");
        System.out.println("El nombre es: " + personaConAtributos.getNombre() + "\nEl apellido es: " + personaConAtributos.getApellido());
        

    }
    
    
    
}
