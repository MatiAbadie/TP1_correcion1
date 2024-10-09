package com.tu_proyecto.domain;

public abstract class Usuario {
    private int id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto
    public abstract void gestionarEvento(EventoGastronomico evento);
}
