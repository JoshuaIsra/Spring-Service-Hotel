
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name ="Personal")

public class PersonalModel extends PersonaModel{
    @Column(unique=true, nullable=false)
    private String id_personal = UUID.randomUUID().toString();
    private String rol; 
    private String turno;

    public PersonalModel() {
    }
    

    public PersonalModel(String id_personal, String rol, String turno) {
        this.id_personal = id_personal;
        this.rol = rol;
        this.turno = turno;
    }


    public String getId_personal() {
        return this.id_personal;
    }

    public void setId_personal(String id_personal) {
        this.id_personal = id_personal;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


}
