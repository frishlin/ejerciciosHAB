
package logica;

public class Gato extends Animal {

    public Gato(String nombre, String color) {
        super(nombre, color);
    }

    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo y soy un gato");
    }

    @Override
    public void hacderSonido() {
        System.out.println("Soy un gato y digo miau, miau");
    }
    
    
}
