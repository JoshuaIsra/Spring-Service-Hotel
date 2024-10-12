package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteModel extends PersonaModel {
    private String metodoPagoPreferido;
    @OneToMany(mappedBy = "cliente")

    private List<ReservaModel> reservaciones;
}
