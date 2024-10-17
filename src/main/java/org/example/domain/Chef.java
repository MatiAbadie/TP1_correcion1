package com.tu_proyecto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chef {
    private UUID id;
    private String nombre;
    private Especialidad especialidad;
    private List<EventoGastronomico> eventos;

    public Chef(int id, String nombre, Especialidad especialidad) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.eventos = new ArrayList<>();
    }

    public void asignarEvento(EventoGastronomico evento) {
        eventos.add(evento);
    }

    public void mostrarInformacion() {
        System.out.println("Chef: " + nombre + " (Especialidad: " + especialidad + ")");
    }

    // Getters y Setters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}
