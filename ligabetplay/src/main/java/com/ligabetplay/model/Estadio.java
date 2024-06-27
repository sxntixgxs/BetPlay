package com.ligabetplay.model;

public class Estadio {
    private int id;
    private String nombre;
    private int idCiudad;
    private int capacidad;
    public Estadio() {
    }
    public Estadio(int id, String nombre, int idCiudad, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.idCiudad = idCiudad;
        this.capacidad = capacidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
