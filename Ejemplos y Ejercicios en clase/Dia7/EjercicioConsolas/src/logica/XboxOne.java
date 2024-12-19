/*
Xbox One: La cual tiene una serie de atributos propios para manejar: Si está
conectada a internet o no, si la calidad 4K está activada y si se permite la
descarga automática de actualizaciones. Al mismo tiempo implementa un
método propio “leerJuegoDigital” el cual recibirá el nombre de un juego como
parámetro e indicará un mensaje por pantalla indicando esta situación. Por
ejemplo: “Leyendo GTA V desde tienda”.
* */

package logica;

public class XboxOne extends Consola{
    boolean conectada;
    boolean calidad4k;
    boolean descargaAuto;


    //constructor

    public XboxOne(String codigoConsola, String nombre, String empresaDesarrollo, int anioLanzamiento, boolean conectada, boolean calidad4k, boolean descargaAuto) {
        super(codigoConsola, nombre, empresaDesarrollo, anioLanzamiento);
        this.conectada = conectada;
        this.calidad4k = calidad4k;
        this.descargaAuto = descargaAuto;
    }

    public XboxOne() {
    }

    //getters y setters


    public boolean isConectada() {
        return conectada;
    }

    public void setConectada(boolean conectada) {
        this.conectada = conectada;
    }

    public boolean isCalidad4k() {
        return calidad4k;
    }

    public void setCalidad4k(boolean calidad4k) {
        this.calidad4k = calidad4k;
    }

    public boolean isDescargaAuto() {
        return descargaAuto;
    }

    public void setDescargaAuto(boolean descargaAuto) {
        this.descargaAuto = descargaAuto;
    }

    //métodos propios
    public void leerJuegoDigital(String nombreJuego) {
        System.out.println("Leyendo " + nombreJuego + " desde tienda.");
    }

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego en XBOX ONE, por favor espere.");
    }
}
