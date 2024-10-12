
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name ="Personal")
public class PersonalModel extends PersonaModel{
    private String rol; 
    private String turno;

    public PersonalModel() {
    }
    

    public PersonalModel(String rol, String turno) {
        this.rol = rol;
        this.turno = turno;
    }


    public PersonalModel(int id, String nombre, String apellido, String telefono, String email, String direccion,
            String rol, String turno) {
        super( nombre, apellido, telefono, email, direccion);
        this.rol = rol;
        this.turno = turno;
    }


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.rol);
        hash = 71 * hash + Objects.hashCode(this.turno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonalModel other = (PersonalModel) obj;
        if (!Objects.equals(this.rol, other.rol)) {
            return false;
        }
        return Objects.equals(this.turno, other.turno);
    }
    
    


    
}
