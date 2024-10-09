package com.tu_proyecto.service;

import com.tu_proyecto.domain.Participante;
import java.util.ArrayList;
import java.util.List;

public class ParticipanteService {
    private List<Participante> participantes = new ArrayList<>();

    public void registrarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public List<Participante> obtenerParticipantes() {
        return participantes;
    }
}
