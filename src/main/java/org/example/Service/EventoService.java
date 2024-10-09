package com.tu_proyecto.service;

import com.tu_proyecto.domain.EventoGastronomico;
import java.util.ArrayList;
import java.util.List;

public class EventoService {
    private List<EventoGastronomico> eventos = new ArrayList<>();

    public void agregarEvento(EventoGastronomico evento) {
        eventos.add(evento);
    }

    public List<EventoGastronomico> obtenerEventos() {
        return eventos;
    }
}
