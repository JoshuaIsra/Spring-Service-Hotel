package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "cliente")
public class ClienteModel extends PersonaModel {
    
    private String metodoPagoPreferido;
    @OneToMany(mappedBy = "cliente")
    @JsonBackReference
    private List<ReservaModel> reservaciones;

    public ClienteModel() {
    }

    public ClienteModel(String metodoPagoPreferido, List<ReservaModel> reservaciones) {
        this.metodoPagoPreferido = metodoPagoPreferido;
        this.reservaciones = reservaciones;
    }

    public ClienteModel(String metodoPagoPreferido, List<ReservaModel> reservaciones, int id, String nombre, String apellido, String telefono, String email, String direccion) {
        super(id, nombre, apellido, telefono, email, direccion);
        this.metodoPagoPreferido = metodoPagoPreferido;
        this.reservaciones = reservaciones;
    }

    public String getMetodoPagoPreferido() {
        return metodoPagoPreferido;
    }

    public void setMetodoPagoPreferido(String metodoPagoPreferido) {
        this.metodoPagoPreferido = metodoPagoPreferido;
    }

    public List<ReservaModel> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<ReservaModel> reservaciones) {
        this.reservaciones = reservaciones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.metodoPagoPreferido);
        hash = 97 * hash + Objects.hashCode(this.reservaciones);
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
        final ClienteModel other = (ClienteModel) obj;
        if (!Objects.equals(this.metodoPagoPreferido, other.metodoPagoPreferido)) {
            return false;
        }
        return Objects.equals(this.reservaciones, other.reservaciones);
    }

    @Override
    public String toString() {
        return "ClienteModel{" + "metodoPagoPreferido=" + metodoPagoPreferido + ", reservaciones=" + reservaciones + '}';
    }

    
 
    
}
