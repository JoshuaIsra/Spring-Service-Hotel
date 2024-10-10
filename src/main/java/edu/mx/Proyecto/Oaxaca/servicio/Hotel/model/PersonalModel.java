
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name ="Personal")

public class PersonalModel extends PersonaModel{
    private int id_personal;
    private String rol;
    private String turno;


    public PersonalModel() {
    }
    

    public PersonalModel(int id_personal, String rol, String turno) {
        this.id_personal = id_personal;
        this.rol = rol;
        this.turno = turno;
    }

    public int getId_personal() {
        return this.id_personal;
    }

    public void setId_personal(int id_personal) {
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
