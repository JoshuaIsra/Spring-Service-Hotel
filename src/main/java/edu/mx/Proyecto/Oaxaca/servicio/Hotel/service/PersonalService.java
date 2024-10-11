package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonalModel;
@Service
public interface PersonalService {
    public void registrarPersonal(PersonalModel personalModel);
    public List obtenerPersonal();
    public PersonalModel getPersonal(int id);
    public void actualizarDatosPersonal(PersonalModel personalModel, int id);
    public void borrarPersonal(int id);
    public void borrarTodasLasPersonales();

}
