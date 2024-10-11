
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="recepcion")
public class RecepcionModel extends PersonalModel{
    private int yearExperiens;
    private List<String> idiomasHablados;
    public RecepcionModel() {
    }

    public RecepcionModel(int yearExperiens, List<String> idiomasHablados) {
        this.yearExperiens = yearExperiens;
        this.idiomasHablados = idiomasHablados;
    }

    public int getYearExperiens() {
        return this.yearExperiens;
    }

    public void setYearExperiens(int yearExperiens) {
        this.yearExperiens = yearExperiens;
    }

    public List<String> getIdiomasHablados() {
        return this.idiomasHablados;
    }

    public void setIdiomasHablados(List<String> idiomasHablados) {
        this.idiomasHablados = idiomasHablados;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.yearExperiens;
        hash = 79 * hash + Objects.hashCode(this.idiomasHablados);
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
        final RecepcionModel other = (RecepcionModel) obj;
        if (this.yearExperiens != other.yearExperiens) {
            return false;
        }
        return Objects.equals(this.idiomasHablados, other.idiomasHablados);
    }
    
}
