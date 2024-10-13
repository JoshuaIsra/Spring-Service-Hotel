package edu.mx.Proyecto.Oaxaca.servicio.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mx.Proyecto.Oaxaca.servicio.Hotel.model.ClienteModel;

@Repository
public interface ClienteRepository extends  JpaRepository<ClienteModel, Integer> {
    public ClienteModel findById(int id);
}
