package logica;

//clase independiente a menos que se especifique con EXTENDS para establecer que esta clase
// es HIJA de ANIMAL
public class Perro extends Animal{
    //atributo propio, que solo perro pueda acceder
    private int cantidadMordidas;

    public Perro(String nombre, int edad, String color, int cantidadMordidas) {
        super(nombre, edad, color);
        this.cantidadMordidas = cantidadMordidas;
    }

    public Perro() {
    }

    public int getCantidadMordidas() {
        return cantidadMordidas;
    }

    public void setCantidadMordidas(int cantidadMordidas) {
        this.cantidadMordidas = cantidadMordidas;
    }

    //método propio
    public void ladrar() {
        System.out.println("Soy un perro y ladro.");
    }

    //sobreescribir método comer
    @Override
    public void comer() {
        System.out.println("Soy un perro y estoy comiendo");
    }


    @Override
    public void comer(String comida) {
        System.out.println("Soy un perro y estoy comiendo " + comida);
    }

}
