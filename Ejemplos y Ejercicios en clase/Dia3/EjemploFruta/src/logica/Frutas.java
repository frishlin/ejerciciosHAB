/*
 Crear una clase llamada Fruta, que tenga los siguientes atributos: nombre, color, calorías, tipoCascara, esComestible 
(tener en cuenta todos sus atributos, constructores, métodos getters y setters).
- Pedirle al usuario por teclado que ingrese los datos de la fruta que quiera guardar.
- Mostrar por pantalla los datos de la fruta creada
- Cambiar un dato de la fruta
- Volver mostrar la fruta con los datos cambiados
 */
package logica;

public class Frutas {
    String nombre;
    String color;
    double calorias;
    String tipoCascara;
    boolean esComestible;

    public Frutas() {
    }
    
    

    public Frutas(String nombre, String color, double calorias, String tipoCascara, boolean esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.esComestible = esComestible;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getCalorias() {
        return calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public boolean isEsComestible() {
        return esComestible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public void setEsComestible(boolean esComestible) {
        this.esComestible = esComestible;
    }
    
    //para toString

    @Override
    public String toString() {
        return "Frutas{" + "nombre=" + nombre + ", color=" + color + ", calorias=" + calorias + ", tipoCascara=" + tipoCascara + ", esComestible=" + esComestible + '}';
    }
    
    
}
