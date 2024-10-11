package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonalModel;

@Repository
public interface PersonalRepository extends JpaRepository<PersonalModel, Integer> {
    public PersonalModel findById(int id);
}
