/*

A partir de la clase abstracta creada crear las siguientes subclases hijas:
✓ Nintendo64: La cual tiene un atributo propio norma y otro para determinar si lee
cartuchos piratas. Al mismo tiempo, implementa un método propio
“leerCartucho” el cual recibirá el nombre de un juego como parámetro e indicará
un mensaje por pantalla indicando esta situación. Por ejemplo: “Leyendo
cartucho Banjo Kazooie”.

* */


package logica;

public class Nintendo64 extends Consola{
    String norma;
    boolean pirata;

    //constructores

    public Nintendo64(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento, String norma, boolean pirata) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.pirata = pirata;
    }

    //Para poder crear el instructor vacío, se hace un constructor vacío en consola, pero como PROTECTED para que solo las clases hijas detecten que la madre tiene un constructor vacío.
    public Nintendo64() {
    }

    //getters y setters

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isPirata() {
        return pirata;
    }

    public void setPirata(boolean pirata) {
        this.pirata = pirata;
    }

    //método propio
    public void leerCartucho(String nombreJuego) {
        System.out.println("Leyendo cartucho de " + nombreJuego);
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego, por favor espere.");

    }
}
