package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="limpieza")
public class LimpiezaModel extends PersonalModel{
    private String areadelimpieza;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((areadelimpieza == null) ? 0 : areadelimpieza.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LimpiezaModel other = (LimpiezaModel) obj;
        if (areadelimpieza == null) {
            if (other.areadelimpieza != null)
                return false;
        } else if (!areadelimpieza.equals(other.areadelimpieza))
            return false;
        return true;
    }

    public String getAreadelimpieza() {
        return areadelimpieza;
    }

    public void setAreadelimpieza(String areadelimpieza) {
        this.areadelimpieza = areadelimpieza;
    }
    
}
