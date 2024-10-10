
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
    


}
