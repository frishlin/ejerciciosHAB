//"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
//b) Una vez creadas las clases, crear los siguientes métodos:
//"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

package logica;


public class Reptil extends Animal {
    private double longitud;
    private String tipoEscamas;  //lisas, quilladas, granulares, imbricdadas, escudos
    private String tipoVenento;  //neurotóxico, hemotóxico, citotóxico, miotóxico, cardiotóxico
    private String habitat;  //desiertos, humaedales, bosques tropicales, regiones montañosas, ecosistamas marinos, sabanas, praderas

    public Reptil() {
    }

    public Reptil(double longitud, String tipoEscamas, String tipoVenento, String habitat, int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVenento = tipoVenento;
        this.habitat = habitat;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVenento() {
        return tipoVenento;
    }

    public void setTipoVenento(String tipoVenento) {
        this.tipoVenento = tipoVenento;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil");
    }
    
}
