/*

Crea la clase Auto que herede de Vehiculo y agrega:
- Un atributo privado propio de auto que sea cantidadPuertas (int).
- Constructores vacio y por parámetros (que inicialice los atributos  heredados y el número de puertas).
- Crea el propio método acelerar() y que imprima "El auto está acelerando".
* */

package logica;

public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    //método propio:  método acelerar() y que imprima "El auto está acelerando".
    public void acelerar() {
        System.out.println("El auto está acelerando");
    }
}
