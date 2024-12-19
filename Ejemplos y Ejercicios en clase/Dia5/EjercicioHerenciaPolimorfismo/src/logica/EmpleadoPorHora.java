/*
Crea la clase EmpleadoPorHora que herede de Empleado y agrega:
- Atributos privados propios llamados horasTrabajadas (int) y tarifaPorHora (double).
- Constructores que inicialicen los atributos heredados, las horas trabajadas y la tarifa por hora.
- Sobreescribe el método calcularSalario() para que devuelva el total calculado como horasTrabajadas * tarifaPorHora.
*/

package logica;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double tarifaPorHora;

    //constructores


    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    //getter y setter


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    //sobreescritura de método calcularSalario
    @Override
    public void calcularSalario() {

        System.out.println("El salario es: " + (horasTrabajadas * tarifaPorHora));
    }

    //sobreescritura de método getDescripcion
    public void getDescripcion() {
        System.out.println("Este empleado tiene una tarifa de: $ " + tarifaPorHora + " por cada hora trabajada. Actualmente trabajó: " + horasTrabajadas + " horas.");
    }

}
