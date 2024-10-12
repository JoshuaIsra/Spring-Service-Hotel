package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.IndividualModel;
@Service
public interface IndividualService {
    public void registrarIndividual(IndividualModel individualModel);
    public List obtenerIndividual();
    public IndividualModel getIndividual(int id);
    public void actualizarDatosIndividual(IndividualModel individualModel, int id);
    public void borrarIndividual(int id);
    public void borrarTodasLasIndividuals();
}
