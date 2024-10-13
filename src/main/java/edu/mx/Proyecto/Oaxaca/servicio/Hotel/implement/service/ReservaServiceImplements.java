package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ReservaModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.ReservaRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.ReservaService;

@Service
public class ReservaServiceImplements implements ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;
    @Override
    public void registrarReserva(ReservaModel reservaModel) {
        reservaRepository.save(reservaModel);
    }

    @Override
    public List obtenerReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public ReservaModel getReserva(int id) {
        return reservaRepository.findById(id);
    }

    @Override
    public void actualizarDatosReserva(ReservaModel reservaModel, int id) {
        reservaModel.setId(id);
        reservaRepository.save(reservaModel);
    }

    @Override
    public void borrarReserva(int id) {
        reservaRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasReservas() {
        reservaRepository.deleteAll();
    }
    
}
