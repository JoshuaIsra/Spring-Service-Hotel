package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonalModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.PersonalRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.PersonalService;

@Service
public class PersonalServiceImplements implements PersonalService {
   @Autowired
   private PersonalRepository personalRepository;

    @Override
    public void registrarPersonal(PersonalModel personalModel) {
        personalRepository.save(personalModel);
    }

    @Override
    public java.util.List obtenerPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public PersonalModel getPersonal(int id) {
        return  personalRepository.findById(id);
    }

    @Override
    public void actualizarDatosPersonal(PersonalModel personalModel, int id) {
        personalModel.setId(id);        
        personalRepository.save(personalModel);
    }

    @Override
    public void borrarPersonal(int id) {
        personalRepository.deleteById(id);        
    }

    @Override
    public void borrarTodasLasPersonales() {
        personalRepository.deleteAll();        
    }

    
    
}
