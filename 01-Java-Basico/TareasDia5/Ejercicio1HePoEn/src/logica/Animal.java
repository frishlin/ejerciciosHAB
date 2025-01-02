/*Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación 
(con sus métodos y constructores correspondientes). 
Agregar también un método llamado saludar que emita un mensaje por pantalla 
que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:*/

package logica;

public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;  //piel con pelo, plumas, escamas, exoesqueleto, piel lisa o húmeda, caparazón o coraza, aletas    
    private String tipoAlimentacion; //carnívoro, herbívoro, omnívoro, insectívoro

    public Animal() {
    }

    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    public void saludar() {
        System.out.println("Hola, soy un animal");
    }
}
