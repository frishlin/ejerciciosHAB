/*
Ejercicio Herencia + Polimorfismo
Crea un sistema de empleados para una empresa utilizando herencia y polimorfismo.
La clase base será Empleado, y las clases hijas serán EmpleadoDependencia y EmpleadoPorHora.

Crea la clase base Empleado con los siguientes atributos protegidos:
	nombre: nombre del empleado (String).
	salarioBase: salario base del empleado (double).
En la clase Empleado, crea los siguientes métodos públicos:
	- Constructores
	- getters y setters
	- método calcularSalario() que emita un mensaje "Debe elegir el tipo de
	  empleado para calcular salario"
	- getDescripción(): método que devuelve una descripción básica del puesto
	  del empleado y sus responsabilidades.
*/

package logica;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    //constructores

    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //métodos públicos
    public void calcularSalario() {
        System.out.println("Debe elegir el tipo de empleado para calcular el salario.");

    }

    public void getDescripcion() {
        System.out.println("El puesto es este y las responsabilidades son estas. ");
    }
}
