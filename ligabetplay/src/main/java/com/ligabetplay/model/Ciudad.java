package com.ligabetplay.model;

public class Ciudad {
    private int id;
    private String nombre;
    public Ciudad() {
    }
    public Ciudad(int id, int idPais, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
