package model;

import java.util.List;

public class JugadorInscrito extends Jugador{
    private int idEquipo;
    private int dorsal;
    private List<Lesion> lesiones;
    private List<Rendimiento> rendimiento;
    public JugadorInscrito(int idEquipo, int dorsal, List<Lesion> lesiones, List<Rendimiento> rendimiento) {
        this.idEquipo = idEquipo;
        this.dorsal = dorsal;
        this.lesiones = lesiones;
        this.rendimiento = rendimiento;
    }
    public JugadorInscrito(int id, int idNacionalidad, int idPosicion, int idEquipo, int dorsal, List<Lesion> lesiones,
            List<Rendimiento> rendimiento) {
        super(id, idNacionalidad, idPosicion);
        this.idEquipo = idEquipo;
        this.dorsal = dorsal;
        this.lesiones = lesiones;
        this.rendimiento = rendimiento;
    }
    public JugadorInscrito(String nombre, int edad, int id, int idNacionalidad, int idPosicion, int idEquipo,
            int dorsal, List<Lesion> lesiones, List<Rendimiento> rendimiento) {
        super(nombre, edad, id, idNacionalidad, idPosicion);
        this.idEquipo = idEquipo;
        this.dorsal = dorsal;
        this.lesiones = lesiones;
        this.rendimiento = rendimiento;
    }
    public int getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public List<Lesion> getLesiones() {
        return lesiones;
    }
    public void setLesiones(List<Lesion> lesiones) {
        this.lesiones = lesiones;
    }
    public List<Rendimiento> getRendimiento() {
        return rendimiento;
    }
    public void setRendimiento(List<Rendimiento> rendimiento) {
        this.rendimiento = rendimiento;
    }
}
