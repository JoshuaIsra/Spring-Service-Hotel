package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.DoblesModel;
@Repository

public interface DoblesRepository extends JpaRepository<DoblesModel, Integer> {    
  public  DoblesModel findById(int id);
    
}
