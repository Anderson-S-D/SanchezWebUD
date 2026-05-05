/**
 * Nombre completo: Anderson Sanchez
 */
package sanchez.modelo;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private String identificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Persona() {
    }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
