package logica;

public class Gato extends Animal{
    private int cantidadAraniazos;

    public Gato(int cantidadAraniazos) {
        this.cantidadAraniazos = cantidadAraniazos;
    }

    public Gato(String nombre, int edad, String color, int cantidadAraniazos) {
        super(nombre, edad, color);
        this.cantidadAraniazos = cantidadAraniazos;
    }

    public Gato() {
    }

    public int getCantidadAraniazos() {
        return cantidadAraniazos;
    }

    public void setCantidadAraniazos(int cantidadAraniazos) {
        this.cantidadAraniazos = cantidadAraniazos;
    }

    //método propio
    public void maullar() {
        System.out.println("Soy un gato y maullo.");
    }
}
