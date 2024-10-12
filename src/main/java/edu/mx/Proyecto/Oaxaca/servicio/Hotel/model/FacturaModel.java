package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

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

    @OneToOne
    @JoinColumn(name = "idReserva",nullable=false)
    private ReservaModel reserva;

    
}
