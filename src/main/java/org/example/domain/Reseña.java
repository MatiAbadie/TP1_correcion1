package com.tu_proyecto.domain;

import java.util.UUID;

public class Reseña {
    private UUID id;
    private EventoGastronomico evento;
    private Participante participante;
    private int calificacion;
    private String comentario;

    public Reseña(int id, EventoGastronomico evento, Participante participante, int calificacion, String comentario) {
        this.id = UUID.randomUUID();
        this.evento = evento;
        this.participante = participante;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    public void crearReseña() {
        System.out.println("Reseña creada por " + participante.getNombre() + " para el evento: " + evento.getNombre());
    }

    // Getters y Setters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public EventoGastronomico getEvento() {
        return evento;
    }

    public void setEvento(EventoGastronomico evento) {
        this.evento = evento;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
