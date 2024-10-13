package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ReservaModel;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaModel, Integer> {
    public ReservaModel findById(int id);
    
}
