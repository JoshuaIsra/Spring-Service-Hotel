package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reserva")
public class ReservaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    @ManyToOne
    @JoinColumn(name = "idCliente",nullable=false)
    @JsonManagedReference
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "idHabitacion",nullable=false)
    private HabitacionModel habitacion;

    @NotNull
    private String estadoReserva;

    @OneToOne
    @JoinColumn(name = "idFactura",nullable = false)
    @JsonManagedReference
    private FacturaModel factura;

    public ReservaModel() {
    }

    public ReservaModel( LocalDate fechaInicio, LocalDate fechaFin, ClienteModel cliente, HabitacionModel habitacion, String estadoReserva, FacturaModel factura) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.estadoReserva = estadoReserva;
        this.factura = factura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public HabitacionModel getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(HabitacionModel habitacion) {
        this.habitacion = habitacion;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public FacturaModel getFactura() {
        return factura;
    }

    public void setFactura(FacturaModel factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "ReservaModel{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cliente=" + cliente + ", habitacion=" + habitacion + ", estadoReserva=" + estadoReserva + ", factura=" + factura + '}';
    }
    

}
