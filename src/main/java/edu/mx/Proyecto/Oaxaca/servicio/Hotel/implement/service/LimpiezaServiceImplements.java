package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.LimpiezaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonalModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.LimpiezaRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.LimpiezaService;

@Service
public class LimpiezaServiceImplements implements LimpiezaService {
    @Autowired
    public LimpiezaRepository limpiezaRepository;

    @Override
    public void registrarPersonalLimpieza(LimpiezaModel limpiezaModel) {
        limpiezaRepository.save(limpiezaModel);
    }

    @Override
    public List obtenerPersonalLimpieza() {
        return limpiezaRepository.findAll();        
    }

    @Override
    public PersonalModel getPersonalLimpieza(int id) {
        return limpiezaRepository.findById(id);
    }

    @Override
    public void actualizarDatosPersonalLimpieza(LimpiezaModel limpiezaModel, int id) {
        limpiezaModel.setId(id);        
        limpiezaRepository.save(limpiezaModel);
    }

    @Override
    public void borrarPersonalLimpieza(int id) {
        limpiezaRepository.deleteById(id);        
    }

    @Override
    public void borrarTodasLasPersonalLimpieza() {
        limpiezaRepository.deleteAll();
    }


}
