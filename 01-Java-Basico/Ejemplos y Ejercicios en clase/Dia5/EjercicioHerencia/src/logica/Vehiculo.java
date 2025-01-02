/*
Crea un sistema de vehículos utilizando herencia. Debes tener una clase base llamada Vehiculo
y dos clases hijas llamadas Auto y Moto.
Requisitos:
- Crea la clase base Vehiculo con los siguientes atributos protegidos:
	marca: marca del vehículo (String).
	modelo: modelo del vehículo (String).
	anio: año de fabricación del vehículo (int).

- En la clase Vehiculo, crea los siguientes métodos públicos:
	- Constructores
	- getters y setters
	- acelerar(): método que imprime "El vehículo está acelerando"
* */

package logica;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //método propio: acelerar(): método que imprime "El vehículo está acelerando"
    public void acelerar(){
        System.out.println("El vehículo está acelerando");
    }
}
