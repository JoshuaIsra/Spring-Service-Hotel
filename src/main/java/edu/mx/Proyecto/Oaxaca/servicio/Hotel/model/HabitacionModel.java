package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="Habitacion")
@Inheritance(strategy=InheritanceType.JOINED)
public class HabitacionModel {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private double precio_por_Noche;
    private boolean estado;
    private int capacidad;
    private List<String> servicios;
    private int numeroCamas ;
    private String tipoCama;


    public HabitacionModel() {
    }

    public HabitacionModel(int capacidad, boolean estado, int id, int numeroCamas, double precio_por_Noche, List<String> servicios, String tipoCama) {
        this.capacidad = capacidad;
        this.estado = estado;
        this.id = id;
        this.numeroCamas = numeroCamas;
        this.precio_por_Noche = precio_por_Noche;
        this.servicios = servicios;
        this.tipoCama = tipoCama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio_por_Noche() {
        return precio_por_Noche;
    }

    public void setPrecio_por_Noche(double precio_por_Noche) {
        this.precio_por_Noche = precio_por_Noche;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HabitacionModel{");
        sb.append("id=").append(id);
        sb.append(", precio_por_Noche=").append(precio_por_Noche);
        sb.append(", estado=").append(estado);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", servicios=").append(servicios);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", tipoCama=").append(tipoCama);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
