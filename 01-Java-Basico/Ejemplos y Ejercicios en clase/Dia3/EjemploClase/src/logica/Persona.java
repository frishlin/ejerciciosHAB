
package logica;

import java.time.LocalDate;

/**
 *
 * @author Sol
 */
public class Persona {
    int id_persona;
    String nombre;
    String apellido;
    LocalDate fecha_nac;
    String direccion;

    public Persona() {
        //constructor vacío
    }

    //constructor con atributos qie se vuelven parámetros
    public Persona(int id_persona, String nombre, String apellido, LocalDate fecha_nac, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
    }
    
    //Alt + Insert para desplegar el menú para generar código
    
    //getter y setter
    
    //Por estándar, java requiere todos los getters y setters, mayormente sobre todo en bases de datos

    //get es considerado función porque es un método que devuelve un valor, ya que tiene un tipo de dato que devuelve y un return.
    
    public int getId_persona() {
        return id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //setter
    //son procedimientos porque son métodos que hacen algo pero no precisamente devuelven un valor. solo puede modificar valores o realizar acciones.
    //tienen la palabra void y no devuelven valor

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
