package com.tu_proyecto.service;

import com.tu_proyecto.domain.Organizador;
import java.util.ArrayList;
import java.util.List;

public class OrganizadorService {
    private List<Organizador> organizadores = new ArrayList<>();

    public void registrarOrganizador(Organizador organizador) {
        organizadores.add(organizador);
    }

    public List<Organizador> obtenerOrganizadores() {
        return organizadores;
    }
}
