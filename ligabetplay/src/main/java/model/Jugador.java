package model;

public class Jugador extends Persona{
    private int id;
    private int idNacionalidad; 
    private int idPosicion;
    public Jugador(){
        super();
    }
    public Jugador(int id, int idNacionalidad, int idPosicion) {
        this.id = id;
        this.idNacionalidad = idNacionalidad;
        this.idPosicion = idPosicion;
    }
    public Jugador(String nombre, int edad, int id, int idNacionalidad, int idPosicion) {
        super(nombre, edad);
        this.id = id;
        this.idNacionalidad = idNacionalidad;
        this.idPosicion = idPosicion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdNacionalidad() {
        return idNacionalidad;
    }
    public void setIdNacionalidad(int idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }
    public int getIdPosicion() {
        return idPosicion;
    }
    public void setIdPosicion(int idPosicion) {
        this.idPosicion = idPosicion;
    }

}
