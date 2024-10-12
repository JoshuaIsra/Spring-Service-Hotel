package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Individual")
public class IndividualModel extends HabitacionModel{
    private String vista;
    private int piso;

    public IndividualModel() {
        
    }

    public IndividualModel(int capacidad, boolean estado, int id, int numeroCamas, double precio_por_Noche, List<String> servicios, String tipoCama) {
        super(capacidad, estado, id, numeroCamas = 1, precio_por_Noche, servicios, tipoCama);
    }
    
    public String getVista() {
        return vista;
    }

    


}
    
