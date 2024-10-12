
package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.SuiteModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.SuiteRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.SuiteService;

@Service
public class SuiteServiceImplements  implements SuiteService{
    @Autowired
    public SuiteRepository suiteRepository;

    @Override
    public void registrarSuite(SuiteModel suiteModel) {
        suiteRepository.save(suiteModel);
    }

    @Override
    public List obtenerSuite() {
        return suiteRepository.findAll();
    }

    @Override
    public SuiteModel getSuite(int id) {
        return suiteRepository.findById(id);
    }

    @Override
    public void actualizarDatosSuite(SuiteModel suiteModel, int id) {
        suiteModel.setId(id);
        suiteRepository.save(suiteModel);
    }

    @Override
    public void borrarSuite(int id) {
        suiteRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasSuites() {
        suiteRepository.deleteAll();
    }
    
}
