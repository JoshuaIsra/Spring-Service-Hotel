package edu.mx.Proyecto.Oaxaca.servicio.Hotel.implement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.HabitacionModel;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository.HabitacionRepository;
import edu.mx.Proyecto.Oaxaca.servicio.Hotel.service.HabitacionService;

@Service
public class HabitacionServiceImplements implements HabitacionService{
    @Autowired
    private HabitacionRepository habitacionRepository;

    @Override
    public void registrarHabitacion(HabitacionModel habitacionModel) {
        habitacionRepository.save(habitacionModel);
    }

    @Override
    public List obtenerHabitacion() {
        return habitacionRepository.findAll();
    }

    @Override
    public HabitacionModel getHabitacion(int id) {
        return habitacionRepository.findById(id);
    }

    @Override
    public void actualizarDatosHabitacion(HabitacionModel habitacionModel, int id) {
        habitacionModel.setId(id);
        habitacionRepository.save(habitacionModel);
    }

    @Override
    public void borrarHabitacion(int id) {
        habitacionRepository.deleteById(id);
    }

    @Override
    public void borrarTodasLasHabitaciones() {
        habitacionRepository.deleteAll();
    }
    

}
