/*
Implementa un sistema para una empresa que gestiona oficinas y directores. 
Cada oficina tiene asignado un solo director, y cada director tiene asignada una sola oficina. 
Tu tarea es modelar estas dos entidades utilizando una relación @OneToOne. 
Debés crear las clases Oficina y Director con sus respectivos atributos 
y asegurarte de mapear correctamente la relación entre ambas.
Además, implementa una clase de prueba que simule la creación de al menos una oficina con su respectivo director, 
persistiendo los datos en una base de datos utilizando JPA.
Requerimientos:
Las entidades deben incluir los atributos que consideres necesarios (por ejemplo, nombre del director, 
número de la oficina, etc.).
Mapear la relación utilizando la anotación @OneToOne.
Configurá correctamente la bidireccionalidad de la relación si es necesario.
Incluí las configuraciones necesarias para persistir las entidades en una base de datos.
*/
package logica;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Oficina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ubicacion;
    private int numeroEmpleados;
    private String tipo;

    @OneToOne
    @JoinColumn(name = "id_director", referencedColumnName = "id")
    Director unDirector;

    public Oficina() {
    }

    public Oficina(Long id, String nombre, String ubicacion, int numeroEmpleados, String tipo, Director unDirector) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numeroEmpleados = numeroEmpleados;
        this.tipo = tipo;
        this.unDirector = unDirector;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Director getUnDirector() {
        return unDirector;
    }

    public void setUnDirector(Director unDirector) {
        this.unDirector = unDirector;
    }
}

