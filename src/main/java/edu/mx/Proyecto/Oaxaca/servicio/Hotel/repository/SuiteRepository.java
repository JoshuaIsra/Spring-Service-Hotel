package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.SuiteModel;
@Repository
public interface SuiteRepository extends JpaRepository<SuiteModel, Integer> {
    public SuiteModel findById(int id);
}
