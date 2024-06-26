package model;

public class Partido {
    private static int autoincremental = 0;
    private int id;
    private Equipo local;
    private Equipo visitante;
    private String fecha;
    private String hora;
    private Estadio estadio;
    public Partido(int id, Equipo local, Equipo visitante, String fecha, String hora, Estadio estadio) {
        this.id = ++autoincremental;
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
    }
    public Partido() {
    }
    public int getId(){
        return id;
    }
    public Equipo getLocal() {
        return local;
    }
    public void setLocal(Equipo local) {
        this.local = local;
    }
    public Equipo getVisitante() {
        return visitante;
    }
    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
