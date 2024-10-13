package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Factura")
public class FacturaModel {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String FechaEmision;
    private Double montoTotal;
    private String metodoPago;

    @OneToOne(mappedBy="factura")
    @JsonBackReference  
    private ReservaModel reservaModel;

    public FacturaModel() {
    }

    public FacturaModel(String fechaEmision, Double montoTotal, String metodoPago, ReservaModel reservaModel) {
        FechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.metodoPago = metodoPago;
        this.reservaModel = reservaModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ReservaModel getReservaModel() {
        return reservaModel;
    }

    public void setReservaModel(ReservaModel reservaModel) {
        this.reservaModel = reservaModel;
    }

    @Override
    public String toString() {
        return "FacturaModel [id=" + id + ", FechaEmision=" + FechaEmision + ", montoTotal=" + montoTotal
                + ", metodoPago=" + metodoPago + ", reservaModel=" + reservaModel + "]";
    }
    
    
}
