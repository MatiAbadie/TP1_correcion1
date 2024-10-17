package com.tu_proyecto.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class EventoGastronomico {
    private UUID id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private String hora;
    private String ubicacion;
    private int capacidad;
    private Chef chef;
    private List<Participante> participantes;

    public EventoGastronomico(int id, String nombre, String descripcion, Date fecha, String hora, String ubicacion, int capacidad, Chef chef) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.chef = chef;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        if (participantes.size() < capacidad) {
            participantes.add(participante);
        } else {
            System.out.println("El evento ha alcanzado su capacidad máxima.");
        }
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }
}
