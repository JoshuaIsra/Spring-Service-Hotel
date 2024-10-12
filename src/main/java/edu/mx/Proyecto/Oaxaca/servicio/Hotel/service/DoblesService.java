package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.DoblesModel;

@Service
public interface DoblesService {
    public void registrarDobles(DoblesModel doblesModel);
    public List obtenerDobles();
    public DoblesModel getDobles(int id);
    public void actualizarDatosDobles(DoblesModel doblesModel, int id);
    public void borrarDobles(int id);
    public void borrarTodasLasDobless();
}
