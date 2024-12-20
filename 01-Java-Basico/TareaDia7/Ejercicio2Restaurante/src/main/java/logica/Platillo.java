/*
Un restaurante necesita un programa para almacenar en una base de datos sus diferentes platillos del menú. 
De cada uno de estos se almacena: id, nombre, receta, precio.
Sabiendo esto:

Crear una base de datos llamada restaurante. Dejarla completamente vacía.
Realizar las configuraciones necesarias para implementar JPA en el proyecto. Esto incluye:
Mapeo mediante annotations
Creación de la unidad de persistencia
Creación de los paquetes para representar capas (logica y persistencia)
Creación de las clases controladoras: para la lógica y para la persistencia.
Creación de los respectivos JPA Controller.
Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.

Recomendación: Para este ejercicio te recomendamos utilizar MAVEN como gestor de dependencias para obtener de forma más sencilla las dependencias necesarias de JPA y MySql. Recuerda que si todo sale bien, la tabla platillo se creará de forma automática.

*/
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Platillo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nombre;
    String receta;
    double precio;

    public Platillo() {
    }

    public Platillo(int id, String nombre, String receta, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillo{" + "id=" + id + ", nombre=" + nombre + ", receta=" + receta + ", precio=" + precio + '}';
    }
    
    
}
