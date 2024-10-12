package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.HabitacionModel;
@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionModel, Integer>{
    public HabitacionModel findById(int id);
    
}
