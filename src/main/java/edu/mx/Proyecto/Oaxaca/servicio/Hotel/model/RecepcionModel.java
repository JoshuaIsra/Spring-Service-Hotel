
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

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
    

}
