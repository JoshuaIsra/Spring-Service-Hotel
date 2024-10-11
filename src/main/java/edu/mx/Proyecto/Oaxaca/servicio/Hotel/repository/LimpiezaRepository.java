package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.LimpiezaModel;

@Repository
public interface LimpiezaRepository extends JpaRepository<LimpiezaModel, Integer> {
    public LimpiezaModel findById(int id);
    
}
