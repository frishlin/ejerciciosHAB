
/*
* Crea una clase llamada CuentaBancaria que modele el comportamiento de una cuenta bancaria.
* La clase debe cumplir con los principios de encapsulamiento, es decir, debe proteger los datos sensibles utilizando modificadores de acceso.
Requisitos:
La clase CuentaBancaria debe tener los siguientes atributos privados:
   -titular: nombre del titular de la cuenta (String).
   -saldo: cantidad de dinero en la cuenta (double).
   -numeroCuenta: número de cuenta (int).
Implementa los siguientes métodos públicos:
   -Constructor para inicializar el titular, el saldo y el número de cuenta.
   -getters y setters
A partir de esto realizar las siguientes pruebas:
   - Crear un objeto CuentaBancaria en el método main. Acceder al método get de cada atributo y mostrar los valores por pantalla.
   - Cambiar el método de acceso del método getSaldo por "private"
   - Intentar acceder al método getSaldo desde el main para mostrarlo por pantalla...
   *¿Es posible hacerlo?¿Qué ocurre?¿Se puede acceder sin problema alguno? (editado)
   * RESPUESTA: NO SE PUEDE ACCEDER, SE PIDA QUE EL MÉTODO SEA PÚBLICO
* */

import logica.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos Salazar", 2542.23, 1111122);
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.setTitular("María Torres");
        cuenta2.setSaldo(253.22);
        cuenta2.setNumeroDeCuenta(22211111);

        System.out.println();
        System.out.println("Datos de la cuenta 1:");
        System.out.println("El titular es: " + cuenta1.getTitular() + "\nEl saldol es: " + cuenta1.getSaldo() +
                "\nLa cuenta es: " + cuenta1.getNumeroDeCuenta());
        System.out.println();
        System.out.println("Datos de la cuenta 2: ");
        System.out.println("El titular es: " + cuenta2.getTitular() + "\nEl saldol es: " + cuenta2.getSaldo() +
                "\nLa cuenta es: " + cuenta2.getNumeroDeCuenta());


    }
}