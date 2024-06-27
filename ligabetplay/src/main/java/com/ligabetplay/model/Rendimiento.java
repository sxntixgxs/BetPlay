package com.ligabetplay.model;

public class Rendimiento {
    private static int incremental = 0;
    private int id;
    private int idJugador;
    private int idPartido;
    private int minutosJugados;
    private int goles;
    private int asistencias;
    private TarjetaAmarilla amarillas;
    private TarjetaRoja rojas;
    public Rendimiento(){}
    public Rendimiento(int id, int idJugador, int idPartido, int minutosJugados, int goles, int asistencias,
            int tarjetasAmarillas, int tarjetasRojas) {
        this.id = ++incremental;
        this.idJugador = idJugador;
        this.idPartido = idPartido;
        this.minutosJugados = minutosJugados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }
    public static void setIncremental(int incremental) {
        Rendimiento.incremental = incremental;
    }
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public static int getIncremental() {
        return incremental;
    }
    public int getId() {
        return id;
    }
    public int getIdJugador() {
        return idJugador;
    }
    public int getIdPartido() {
        return idPartido;
    }
    public int getMinutosJugados() {
        return minutosJugados;
    }
    public int getGoles() {
        return goles;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    
    
}
