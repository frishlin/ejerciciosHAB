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

Crea la clase Auto que herede de Vehiculo y agrega:
- Un atributo privado propio de auto que sea cantidadPuertas (int).
- Constructores vacio y por parámetros (que inicialice los atributos  heredados y el número de puertas).
- Crea el propio método acelerar() y que imprima "El auto está acelerando".
Crea la clase Moto que herede de Vehiculo y agrega:
- Un atributo privado propio llamado cilindrada (double).
- Constructores vacío y por parámetros que inicialice los atributos heredados y la cilindrada.
- Crear el propio método acelerar() para que imprima "La moto está acelerando".


Luego, en una clase principal, crea un objeto de cada tipo (Auto y Moto),
y utiliza sus métodos para mostrar la información y simular que están acelerando.
¿Qué sucede al tener ambas clases un método con el mismo nombre?
Al heredar de la misma clase madre... ¿Muestran resultados diferentes o iguales?
 */


import logica.Auto;
import logica.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto1 = new Moto("marca1M", "modelo1M", 1983, 22.2);
        Auto auto1 = new Auto("marca1A", "modelo1A", 2000, 4);

        System.out.println();
        System.out.println("Los datos de la Moto1, son: ");
        System.out.println("Marca: " + moto1.getMarca() + "\nModelo: " + moto1.getModelo() +
                "\nAño: " + moto1.getAnio() + "\nCilindrada: " + moto1.getCilindrada());
        moto1.acelerar();

        System.out.println();
        System.out.println("Los datos del Auto 1, son: ");
        System.out.println("Marca: " + auto1.getMarca() + "\nModelo: " + auto1.getModelo() +
                "\nAño: " + auto1.getAnio() + "\nCilindrada: " + auto1.getCantidadPuertas());

        auto1.acelerar();

    }
}