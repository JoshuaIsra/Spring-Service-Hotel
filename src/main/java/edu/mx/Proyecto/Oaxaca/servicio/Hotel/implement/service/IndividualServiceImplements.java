package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.IndividualModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.IndividualRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.IndividualService;

@Service
public class IndividualServiceImplements implements  IndividualService{
    @Autowired
    private IndividualRepository individualRepository;
    @Override
    public void registrarIndividual(IndividualModel individualModel) {
        individualRepository.save(individualModel);
    }

    @Override
    public List obtenerIndividual() {
        return individualRepository.findAll();        
    }

    @Override
    public IndividualModel getIndividual(int id) {
        return individualRepository.findById(id);
    }

    @Override
    public void actualizarDatosIndividual(IndividualModel individualModel, int id) {
        individualModel.setId(id);        
        individualRepository.save(individualModel);
    }

    @Override
    public void borrarIndividual(int id) {
        individualRepository.deleteById(id);        
    }

    @Override
    public void borrarTodasLasIndividuals() {
        individualRepository.deleteAll();        
    }
   
    
}
