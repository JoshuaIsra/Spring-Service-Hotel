package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonaModel;

@Service
public interface PersonaService {
    public void registrarPersona(PersonaModel personaModel);
    public List obtenerPersona();
    public PersonaModel getPersona(int id);
    public void actualizarDatosPersona(PersonaModel personaModel, int id);
    public void borrarPersona(int id);
    public void borrarTodasLasPersonas();
    
}
