/*
Crea la clase Moto que herede de Vehiculo y agrega:
- Un atributo privado propio llamado cilindrada (double).
- Constructores vacío y por parámetros que inicialice los atributos heredados y la cilindrada.
- Crear el propio método acelerar() para que imprima "La moto está acelerando".
Luego, en una clase principal, crea un objeto de cada tipo (Auto y Moto),
y utiliza sus métodos para mostrar la información y simular que están acelerando.
¿Qué sucede al tener ambas clases un método con el mismo nombre?
Al heredar de la misma clase madre... ¿Muestran resultados diferentes o iguales?
* */

package logica;

public class Moto extends Vehiculo{
    private double cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, int anio, double cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    //método propio: método acelerar() para que imprima "La moto está acelerando"
    public void acelerar() {
        System.out.println("La moto está acelarando.");
    }

}
