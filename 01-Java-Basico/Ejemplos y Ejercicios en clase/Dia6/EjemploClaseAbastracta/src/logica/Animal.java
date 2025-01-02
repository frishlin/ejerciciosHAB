
package logica;


//cuando una clase es "común" el icono de la clase tiene un icono distinto a cuando se pone "abstract"
public abstract class Animal {
    String nombre;
    String color;
    
    //no suelen tener constructores
    //porque no se busca que se INSTANCIE la clase

    //se crea el constructor como protected
    protected Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    
    
    
    //método implementado
    public void holaAnimal() {
        System.out.println("Hola, soy el animal: " + nombre);
    }
    
    //método abstracto = con abstract yo digo que estos métodos son declarados y no tendrán implementación
    public abstract void comer();
    public abstract void hacderSonido();
    
    
}
