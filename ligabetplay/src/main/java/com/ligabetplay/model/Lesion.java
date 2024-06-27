package com.ligabetplay.model;

public class Lesion {
    private static int contador = 0;//para generar id autoincremental
    private int id;
    private String nombre;
    public Lesion(int id, String nombre) {
        this.id = ++contador;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
}
