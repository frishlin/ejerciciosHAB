/*
Ejercicio Clases abstractas @canal
• Crear una clase abstracta llamada consola, la cual tenga los atributos:
codigo_consola, nombre, empresaDesarrollo y año de lanzamiento. Al mismo tiempo,
crear un método abstracto “cargarJuego” que indique un mensaje por pantalla que
diga “Cargando juego. Por favor espere”.
A partir de la clase abstracta creada crear las siguientes subclases hijas:
✓ Nintendo64:
✓ PlayStation2
✓ Xbox One
*/

package logica;

//es una clase abstracta
public abstract class Consola {
    private String codigoConsola;
    private String nombre;
    private String empresaDesarrollo;
    private int anioLanzamiento;

    //para que una clase hija, pueda hacer uso de los atributos, consola debe tener un constructor, pero solo par que lo usen sus hijos
    //por tanto debe ser de tipo PROTECTED


    protected Consola() { //para poder tener constructor vacío en las hijas
    }

    protected Consola(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        this.codigoConsola = codigoConsola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }

    //crear un método abstracto para cargar método
    //se cambia protected para que se pueda acceder al método cargarJuego
    public abstract void cargarJuego(); //ya que será solo para las hijas

    //como la consigna quiere que haya un mensaje, hay dos opciones: o se implementa el método abstracto y después se implementa en cada clase hija el mensaje, se saltea la trampa
    //la otra es la pista de la consigna, crear otro método que sea public void cargarJuegoMensaje y que ese sí tenga la implementación

    /*public void cargarJuegoMje() {
        System.out.println("Cargando juego, por favor espere"); //quiere que cada hija lo implemente, por tanto, se deja el método abstracto que no tiene implementación
    } SE DEBE PONER EN EL "DOCUMENTO DE SUPUESTOS"*/

    //ahora se crean las 3 clases
}
