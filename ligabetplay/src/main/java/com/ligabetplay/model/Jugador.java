package com.ligabetplay.model;

public class Jugador extends Persona{
    private int id;
    private String nacionalidad; 
    private String posicion;
    public Jugador(){
        super();
    }
    public Jugador(int id, String nacionalidad, String posicion) {
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
    }
    public Jugador(String nombre, int edad, int id, String nacionalidad, String posicion) {
        super(nombre, edad);
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.posicion = posicion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getnacionalidad() {
        return nacionalidad;
    }
    public void setnacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getposicion() {
        return posicion;
    }
    public void setposicion(String posicion) {
        this.posicion = posicion;
    }

}
