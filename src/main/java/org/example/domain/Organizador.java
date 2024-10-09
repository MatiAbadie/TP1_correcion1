package com.tu_proyecto.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Organizador extends Usuario {
    private List<EventoGastronomico> eventos;

    public Organizador(int id, String nombre) {
        super(id, nombre);
        this.eventos = new ArrayList<>();
    }

    public void crearEvento(int id, String nombre, String descripcion, Date fecha, String hora, String ubicacion, int capacidad, Chef chef) {
        EventoGastronomico evento = new EventoGastronomico(id, nombre, descripcion, fecha, hora, ubicacion, capacidad, chef);
        eventos.add(evento);
        chef.asignarEvento(evento);
    }

    public void gestionarEvento(EventoGastronomico evento) {
        eventos.add(evento);
    }

    public void asignarChef(Chef chef, EventoGastronomico evento) {
        evento.agregarParticipante(chef);
    }

    // Getters y Setters


    public List<EventoGastronomico> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoGastronomico> eventos) {
        this.eventos = eventos;
    }
}
