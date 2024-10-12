package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.HabitacionModel;

@Service
public interface HabitacionService {
    public void registrarHabitacion(HabitacionModel habitacionModel);
    public List obtenerHabitacion();
    public HabitacionModel getHabitacion(int id);
    public void actualizarDatosHabitacion(HabitacionModel habitacionModel, int id);
    public void borrarHabitacion(int id);
    public void borrarTodasLasHabitaciones();
}
