/*

✓ PlayStation2: La cual tiene los atributos propios norma, chipeadaONo y
tamañoMemoryCard. Al mismo tiempo, implementa un método propio “leerDvd”
el cual recibirá el nombre de un juego como parámetro e indicará un mensaje
por pantalla indicando esta situación. Por ejemplo: “Leyendo DVD Fifa 2009”.
Por otro lado, también implementa un método propio llamado “grabarEnMemory”
el cual debe informar al usuario que se ha guardado correctamente un juego en
la memory card.

*/

package logica;

public class PlayStation2 extends Consola {
    String norma;
    boolean chipeada;
    double tamanioMemory;

    //constructor

    public PlayStation2(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento, String norma, boolean chipeada, double tamanioMemory) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.chipeada = chipeada;
        this.tamanioMemory = tamanioMemory;
    }

    public PlayStation2() {
    }

    //getters y setters


    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public boolean isChipeada() {
        return chipeada;
    }

    public void setChipeada(boolean chipeada) {
        this.chipeada = chipeada;
    }

    public double getTamanioMemory() {
        return tamanioMemory;
    }

    public void setTamanioMemory(double tamanioMemory) {
        this.tamanioMemory = tamanioMemory;
    }

    //métodos propios
    public void LeerDvd(String nombreJuego) {
        System.out.println("Leyendo DVD de " + nombreJuego);
    }

    public void grabarEnMemory() {
        System.out.println("Se guardó correctamente el juego");
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego en PS2, por favor espere.");
    }
}
