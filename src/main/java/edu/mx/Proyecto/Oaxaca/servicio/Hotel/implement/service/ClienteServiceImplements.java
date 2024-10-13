package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ClienteModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.ClienteRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.ClienteService;

@Service
public class ClienteServiceImplements implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void registrarCliente(ClienteModel clienteModel) {
        clienteRepository.save(clienteModel);
    }

    @Override
    public List obtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteModel getCliente(int id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void actualizarCliente(ClienteModel clienteModel , int id) {
        clienteModel.setId(id);
        clienteRepository.save(clienteModel);
    }

    @Override
    public void borrarCliente(int id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void borrartodosLosClientes() {
        clienteRepository.deleteAll();
    }
 
}
