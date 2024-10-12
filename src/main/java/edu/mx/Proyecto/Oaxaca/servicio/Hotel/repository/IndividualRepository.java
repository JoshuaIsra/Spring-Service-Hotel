package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.IndividualModel;

@Repository
public interface IndividualRepository extends JpaRepository<IndividualModel, Integer> {
    public IndividualModel findById(int id);
    

}