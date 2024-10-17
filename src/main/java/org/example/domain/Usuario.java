package com.tu_proyecto.domain;

import java.util.UUID;

public abstract class Usuario {
    private UUID id;
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Método abstracto
    public abstract void gestionarEvento(EventoGastronomico evento);
}
