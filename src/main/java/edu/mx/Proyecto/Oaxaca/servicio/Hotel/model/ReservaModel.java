package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.time.LocalDate;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.CascadeType;
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
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "idHabitacion",nullable=false)
    private HabitacionModel habitacion;

    @NotNull
    private String estadoReserva;

    @OneToOne(mappedBy = "reserva",cascade = CascadeType.ALL)
    private FacturaModel factura;


}
