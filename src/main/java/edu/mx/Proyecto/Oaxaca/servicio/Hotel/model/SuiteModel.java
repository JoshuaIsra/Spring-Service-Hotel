package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Suite")
public class SuiteModel extends HabitacionModel {
    private  boolean jacuzzi ;
    private boolean espacioAdicional;
    private String vista;

    public SuiteModel() {
    }

    public SuiteModel(boolean espacioAdicional, boolean jacuzzi, String vista) {
        this.espacioAdicional = espacioAdicional;
        this.jacuzzi = jacuzzi;
        this.vista = vista;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public boolean isEspacioAdicional() {
        return espacioAdicional;
    }

    public void setEspacioAdicional(boolean espacioAdicional) {
        this.espacioAdicional = espacioAdicional;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (jacuzzi ? 1231 : 1237);
        result = prime * result + (espacioAdicional ? 1231 : 1237);
        result = prime * result + ((vista == null) ? 0 : vista.hashCode());
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
        SuiteModel other = (SuiteModel) obj;
        if (jacuzzi != other.jacuzzi)
            return false;
        if (espacioAdicional != other.espacioAdicional)
            return false;
        if (vista == null) {
            if (other.vista != null)
                return false;
        } else if (!vista.equals(other.vista))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SuiteModel [jacuzzi=" + jacuzzi + ", espacioAdicional=" + espacioAdicional + ", vista=" + vista
                + ", isJacuzzi()=" + isJacuzzi() + ", isEspacioAdicional()=" + isEspacioAdicional() + ", getVista()="
                + getVista() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
                + super.toString() + "]";
    }
    
    
}
