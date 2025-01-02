/*
 Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación 
(con sus métodos y constructores correspondientes). 
Agregar también un método llamado saludar que emita un mensaje por pantalla 
que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:

a) Crear sus clases hijas que compartan sus atributos y métodos:
"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.

b) Una vez creadas las clases, crear los siguientes métodos:
"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
d) Crear un objeto de tipo animal e intentar asignarle al Mamífero creado… 
¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
E) Cambiar el modificador de acceso de los métodos de "public" a "private". 
Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?

Respuesta:  Si se intenta acceder a los métodos saludar con private, dará un error de compilación.
            ya que mamifero.saludar(); no puede acceder a un método privado.
            Para resolverlo, se debe cambiar el modificador de acceso a "public".
 */
package ejercicio1hepoen;

import logica.Animal;
import logica.Ave;
import logica.Mamifero;
import logica.Reptil;


public class Ejercicio1HePoEn {

    public static void main(String[] args) {
        //Creación de objetos para las clases hijas
        Mamifero mamifero = new Mamifero(4, "Placentarios", "Uniforme", "Bosque", 1, "León", 5, "Piel con pelo", "Carnívoro");
        Ave ave = new Ave(1.2, "Planeador", "Brillante", "Curvo", 2, "Águila", 3, "Plumas", "Carnívoro");
        Reptil reptil = new Reptil(2.5, "Escamas lisas", "Neurotóxico", "Desierto", 3, "Cobra", 2, "Escamas", "Carnívoro");
        
        //Llamando al método saludar de cada objeto
        mamifero.saludar();
        ave.saludar();
        reptil.saludar();
        
        //creando un objeto de tipo animal y asignando un mamífero
        Animal animal = reptil; //ya que mamífero es un animal
        animal.saludar();
    }
    
}
