package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.PersonaModel;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel, Integer>{
    public PersonaModel findById(int id);
}
