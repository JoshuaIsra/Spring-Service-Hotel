package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.RecepcionModel;
@Repository
public interface RecepcionRepository extends JpaRepository<RecepcionModel, Integer>{
    public RecepcionModel findById(int id);
    
}
