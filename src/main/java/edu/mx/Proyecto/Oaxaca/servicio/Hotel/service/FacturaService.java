package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.FacturaModel;

@Service
public interface FacturaService {
    public void registrarFactura(FacturaModel facturaModel);
    public List obtenerFactura();
    public FacturaModel getFactura(int id);
    public void actualizarDatosFactura(FacturaModel facturaModel, int id);
    public void borrarFactura(int id);
    public void borrarTodasLasFacturas();
}
