package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Individual")
public class IndividualModel extends HabitacionModel{
    private String vista;
    private int piso;

    public IndividualModel() {
        
    }

    public IndividualModel(int capacidad, boolean estado, int id, int numeroCamas, double precio_por_Noche, List<String> servicios, String tipoCama) {
        super(capacidad, estado, id, numeroCamas = 1, precio_por_Noche, servicios, tipoCama);
    }
    
    public String getVista() {
        return vista;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.vista);
        hash = 59 * hash + this.piso;
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
        final IndividualModel other = (IndividualModel) obj;
        if (this.piso != other.piso) {
            return false;
        }
        return Objects.equals(this.vista, other.vista);
    }

    
    

}
    
