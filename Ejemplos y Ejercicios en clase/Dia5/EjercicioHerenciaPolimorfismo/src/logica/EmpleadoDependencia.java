/*
Crea la clase EmpleadoDependencia que herede de Empleado y agrega:
	- Un atributo propio privado llamado bono (double).
	- Constructores que inicialicen los atributos heredados y propio/s.
	- Sobreescribe el método calcularSalario() para que devuelva el salario base más el bono.
	- Sobrecarga/sobrescribe (decidir qué creen mejor) el método getDescripcion() para que,
	  además de explica el rol del empleado, muestre el bono que cobra por ser empleado en relac de dependencia
*/

package logica;

public class EmpleadoDependencia extends Empleado{
    private double bono;

    //constructores

    public EmpleadoDependencia() {
    }

    public EmpleadoDependencia(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    //getters y setters


    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    //sobreescritura de método calcularSalario
    @Override
    public void calcularSalario() {
        System.out.println("El salario es: $ " + (salarioBase + bono));
    }

    //sobreescritura de método getDescripcion
    @Override
    public void getDescripcion() {
        System.out.println("Este empleado de Dependencia tiene un salario de: $ " + salarioBase + " y recibe un bono de: $ " + bono);
    }

}
