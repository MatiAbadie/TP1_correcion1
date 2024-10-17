package com.tu_proyecto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Participante {
    private UUID id;
    private String nombre;
    private String apellido;
    private List<InteresCulinario> interesesCulinarios;
    private List<EventoGastronomico> historialEventos;
    private List<Reseña> reseñas;

    public Participante(int id, String nombre, String apellido) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.interesesCulinarios = new ArrayList<>();
        this.historialEventos = new ArrayList<>();
        this.reseñas = new ArrayList<>();
    }

    public void registrarEnEvento(EventoGastronomico evento) {
        historialEventos.add(evento);
        evento.agregarParticipante(this);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<InteresCulinario> getInteresesCulinarios() {
        return interesesCulinarios;
    }

    public void setInteresesCulinarios(List<InteresCulinario> interesesCulinarios) {
        this.interesesCulinarios = interesesCulinarios;
    }

    public List<EventoGastronomico> getHistorialEventos() {
        return historialEventos;
    }

    public void setHistorialEventos(List<EventoGastronomico> historialEventos) {
        this.historialEventos = historialEventos;
    }

    public List<Reseña> getReseñas() {
        return reseñas;
    }

    public void setReseñas(List<Reseña> reseñas) {
        this.reseñas = reseñas;
    }
}
