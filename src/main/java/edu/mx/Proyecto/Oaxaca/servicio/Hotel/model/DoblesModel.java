
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "Dobles")

public class DoblesModel extends HabitacionModel{
    private static final int numeroCamas = 2;
    private  boolean baalcon;
    private boolean televicion; 

    public DoblesModel() {
        
    }

    public DoblesModel(boolean baalcon, boolean televicion) {
        this.baalcon = baalcon;
        this.televicion = televicion;
    }

    public DoblesModel(boolean baalcon, boolean televicion, int capacidad, boolean estado, int id, int numeroCamas, double precio_por_Noche, List<String> servicios, String tipoCama) {
        super(capacidad, estado, id, numeroCamas, precio_por_Noche, servicios, tipoCama);
        this.baalcon = baalcon;
        this.televicion = televicion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.baalcon ? 1 : 0);
        hash = 73 * hash + (this.televicion ? 1 : 0);
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
        final DoblesModel other = (DoblesModel) obj;
        if (this.baalcon != other.baalcon) {
            return false;
        }
        return this.televicion == other.televicion;
    }
    
    

}
