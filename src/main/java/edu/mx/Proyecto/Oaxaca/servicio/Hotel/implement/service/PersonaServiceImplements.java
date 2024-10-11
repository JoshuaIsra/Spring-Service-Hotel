package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.PersonaRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.PersonaService;

@Service
public class PersonaServiceImplements implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public void registrarPersona(PersonaModel personaModel) {
        personaRepository.save(personaModel); 
    }

    @Override
    public List obtenerPersona() {
        return personaRepository.findAll();
    }

    @Override
    public PersonaModel getPersona(int id) {
        return personaRepository.findById(id);
    }

    @Override
    public void actualizarDatosPersona(PersonaModel personaModel, int id) {
        personaModel.setId(id);
        personaRepository.save(personaModel);
    }

    @Override
    public void borrarPersona(int id) {
        personaRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasPersonas() {
        personaRepository.deleteAll();
    }

}
