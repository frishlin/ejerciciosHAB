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
   *                        ¿Es posible hacerlo?¿Qué ocurre?¿Se puede acceder sin problema alguno? (editado)
* */

package logica;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int numeroDeCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, int numeroDeCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
}
