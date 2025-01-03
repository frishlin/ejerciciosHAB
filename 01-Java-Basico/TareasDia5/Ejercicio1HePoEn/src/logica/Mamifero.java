/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
a) Crear sus clases hijas que compartan sus atributos y métodos:
"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
b) Una vez creadas las clases, crear los siguientes métodos:
"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
*/

package logica;


public class Mamifero extends Animal {
    private int numeroPatas; //4-cuadrúpedos, 4-tetrápodos, 2-bípedos, 0-sin patas
    private String tipoReproduccion;  //placentarios, marsupiales, monotremas
    private String colorPelaje;  //uniformes, moteados, rayados, cambiantes
    private String habitat;  //desiertos, bosques, praderas, sabanas, áreas montañosas, áreas polares, medis acuáticos, ciudades

    public Mamifero() {
    }

    public Mamifero(int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat, int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero");
    }
}