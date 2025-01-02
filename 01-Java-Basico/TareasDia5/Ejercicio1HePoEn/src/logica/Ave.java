//"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
//b) Una vez creadas las clases, crear los siguientes métodos:
//"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".

package logica;

public class Ave extends Animal {
    private double envergaduraAlas;
    private String tipoVuelo;  //planeador, batido, estacionario, picada, migratorio
    private String colorPlumaje;  //críptico, brillante, monocromático, estacional, juvenil
    private String tipoPico;  //curvo, cónico, fino y largo, filtrador, gancho, espátula, perforador

    public Ave() {
    }

    public Ave(double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico, int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }
    
}
