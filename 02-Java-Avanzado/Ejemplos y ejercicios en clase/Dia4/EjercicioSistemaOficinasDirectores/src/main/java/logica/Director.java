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
import javax.persistence.OneToOne;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    @OneToOne(mappedBy = "unDirector", cascade = CascadeType.ALL)
    private Oficina oficina;

    
    public Director() {
    }

    public Director(Long id, String nombre, String apellido, String email, String telefono, Oficina oficina) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.oficina = oficina;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}
