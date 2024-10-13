package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.FacturaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.FacturaRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.FacturaService;

@Service
public class FacturaServiceImplements implements  FacturaService{
    @Autowired
    private FacturaRepository facturaRepository;
    @Override
    public void registrarFactura(FacturaModel facturaModel) {
        facturaRepository.save(facturaModel);
    }

    @Override
    public List obtenerFactura() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaModel getFactura(int id) {
        return facturaRepository.findById(id);
    }

    @Override
    public void actualizarDatosFactura(FacturaModel facturaModel, int id) {
        facturaModel.setId(id);
        facturaRepository.save(facturaModel);
    }

    @Override
    public void borrarFactura(int id) {
        facturaRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasFacturas() {
        facturaRepository.deleteAll();
    }
     
}
