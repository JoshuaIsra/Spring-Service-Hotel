package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ReservaModel;

@Service
public interface ReservaService {
    public void registrarReserva(ReservaModel reservaModel);
    public List obtenerReservas();
    public ReservaModel getReserva(int id);
    public void actualizarDatosReserva(ReservaModel reservaModel, int id);
    public void borrarReserva(int id);
    public void borrarTodasLasReservas();
}
