package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.SuiteModel;

@Service
public interface SuiteService {
    public void registrarSuite(SuiteModel suiteModel);
    public List obtenerSuite();
    public SuiteModel getSuite(int id);
    public void actualizarDatosSuite(SuiteModel suiteModel, int id);
    public void borrarSuite(int id);
    public void borrarTodasLasSuites();
}
