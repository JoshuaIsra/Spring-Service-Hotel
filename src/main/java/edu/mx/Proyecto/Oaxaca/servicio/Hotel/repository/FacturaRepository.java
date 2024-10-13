package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.FacturaModel;

@Repository
public interface FacturaRepository extends  JpaRepository<FacturaModel, Integer> {
    public FacturaModel findById(int id);
    
}
