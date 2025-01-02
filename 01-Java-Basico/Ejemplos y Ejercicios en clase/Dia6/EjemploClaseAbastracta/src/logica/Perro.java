//java crea el método comer y hacer sonido declarados como abstractos y hace una implementación dentro poniendo un throw me...


package logica;

public class Perro extends Animal {

    //al insertar nuevamente el constructor, ya trae los atributos (después de crear el constructor en Animal)
    public Perro(String nombre, String color) {
        super(nombre, color);
    }

    

    @Override
    public void comer() {
        System.out.println("Hola soy un perro y como");
    }

    @Override
    public void hacderSonido() {
        System.out.println("Hola, soy un perro y digo guau, guau");
    }
    
}
