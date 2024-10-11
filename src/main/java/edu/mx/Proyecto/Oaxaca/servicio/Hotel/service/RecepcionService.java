package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.RecepcionModel;

@Service
public interface RecepcionService {
    public void registrarPersonalRecpcion(RecepcionModel recepcionModel);
    public List obtenerPersonalRecpcion();
    public RecepcionModel getPersonalRecpcion(int id);
    public void actualizarDatosPersonalRecpcion(RecepcionModel recepcionModel, int id);
    public void borrarPersonalRecpcion(int id);
    public void borrarTodasLasPersonalRecpcion();
}
