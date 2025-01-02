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

    //** sobreescritura del método comer
    @Override
    public void comer() {
        System.out.println("Soy un gato y estoy comiendo");
    }

    //sobrecarga del método comer para saber qué come el gato
    //en este caso no pide sobreescritura porque aunque tiene el mismo nombre del método, no es el mismo debido al parámetro
    //se vuelve un método propio de la clase
    //al compartir el mismo método con atributo, se pasará a la clase madre
    /*public void comer(String comida) {
        System.out.println("Soy un gato y estoy comiendo " + comida);
    }*/

    //ahora Gato marcará un @override y ahora habrá sobreescritura y sobrecarga ***
    @Override
    public void comer(String comida) {
        System.out.println("Soy un gato y estoy comiendo " + comida);
    }
}
