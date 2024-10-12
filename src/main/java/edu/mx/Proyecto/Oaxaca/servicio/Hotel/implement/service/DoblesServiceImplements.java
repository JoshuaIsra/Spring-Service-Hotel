
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.DoblesModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.DoblesRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.DoblesService;

@Service
public class DoblesServiceImplements implements DoblesService {
    @Autowired  
    private DoblesRepository doblesRepository;  
    @Override
    public void registrarDobles(DoblesModel doblesModel) {
        doblesRepository.save(doblesModel);        
    }

    @Override
    public List obtenerDobles() {
        return doblesRepository.findAll();        
    }

    @Override
    public DoblesModel getDobles(int id) {
        return doblesRepository.findById(id);
    }

    @Override
    public void actualizarDatosDobles(DoblesModel doblesModel, int id) {
        doblesModel.setId(id);        
        doblesRepository.save(doblesModel); 
    }

    @Override
    public void borrarDobles(int id) {
        doblesRepository.deleteById(id);        
    }

    @Override
    public void borrarTodasLasDobless() {
        doblesRepository.deleteAll();        
    }
    
}
