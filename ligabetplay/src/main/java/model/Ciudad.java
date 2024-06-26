package model;

public class Ciudad {
    private int id;
    private int idPais;
    private String nombre;
    public Ciudad() {
    }
    public Ciudad(int id, int idPais, String nombre) {
        this.id = id;
        this.idPais = idPais;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdPais() {
        return idPais;
    }
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
