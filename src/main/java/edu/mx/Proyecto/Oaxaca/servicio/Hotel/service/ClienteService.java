package edu.mx.Proyecto.Oaxaca.servicio.Hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ClienteModel;
@Service
public interface ClienteService {
    public void registrarCliente(ClienteModel clienteModel);
    public List obtenerClientes();
    public ClienteModel getCliente(int id);
    public void actualizarCliente(ClienteModel clienteModel, int id);
    public void borrarCliente(int id);
    public void borrartodosLosClientes();
    
    
}
