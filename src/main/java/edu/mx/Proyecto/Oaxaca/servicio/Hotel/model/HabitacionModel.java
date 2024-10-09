package edu.mx.Proyecto.Oaxaca.servicio.Hotel.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class HabitacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private String estado;
    private int capacidad;
    private List<String> servicios;

    public HabitacionModel() {
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioPorNoche() {
        return this.precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<String> getServicios() {
        return this.servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", precioPorNoche='" + getPrecioPorNoche() + "'" +
            ", estado='" + getEstado() + "'" +
            ", capacidad='" + getCapacidad() + "'" +
            ", servicios='" + getServicios() + "'" +
            "}";
    }
    
    }

    