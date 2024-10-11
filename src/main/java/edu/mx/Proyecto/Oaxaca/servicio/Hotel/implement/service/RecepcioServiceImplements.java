package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.RecepcionModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.RecepcionRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.RecepcionService;

@Service
public class RecepcioServiceImplements implements RecepcionService {
    @Autowired
    public RecepcionRepository recepcionRepository;

    @Override
    public void registrarPersonalRecpcion(RecepcionModel recepcionModel) {
        recepcionRepository.save(recepcionModel);
    }

    @Override
    public List obtenerPersonalRecpcion() {
        return recepcionRepository.findAll();
    }

    @Override
    public RecepcionModel getPersonalRecpcion(int id) {
        return recepcionRepository.findById(id);
        
    }

    @Override
    public void actualizarDatosPersonalRecpcion(RecepcionModel recepcionModel, int id) {
        recepcionModel.setId(id);
        recepcionRepository.save(recepcionModel);
    }

    @Override
    public void borrarPersonalRecpcion(int id) {
        recepcionRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasPersonalRecpcion() {
        recepcionRepository.deleteAll();
    }
    
}
