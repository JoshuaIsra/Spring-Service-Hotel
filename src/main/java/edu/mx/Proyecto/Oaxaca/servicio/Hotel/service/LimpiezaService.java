package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;


import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.LimpiezaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonalModel;

@Service
public interface LimpiezaService {
    public void registrarPersonalLimpieza(LimpiezaModel limpiezaModel);
    public List obtenerPersonalLimpieza();
    public PersonalModel getPersonalLimpieza(int id);
    public void actualizarDatosPersonalLimpieza(LimpiezaModel limpiezaModel, int id);
    public void borrarPersonalLimpieza(int id);
    public void borrarTodasLasPersonalLimpieza();
}
