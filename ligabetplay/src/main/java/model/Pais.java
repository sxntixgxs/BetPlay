package model;

public class Pais {
    private int id;
    private String nombre;
    public Pais(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Pais() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getpais() {
        return nombre;
    }
    public void setpais(String pais) {
        this.nombre = pais;
    }
}
