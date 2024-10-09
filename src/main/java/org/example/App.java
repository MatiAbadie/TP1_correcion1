package org.example;

import com.tu_proyecto.domain.Chef;
import com.tu_proyecto.domain.Organizador;
import com.tu_proyecto.enums.Especialidad;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Organizador organizador = new Organizador(1, "Matias Abadie");
        Chef chef = new Chef(1, "Juana Meyer", Especialidad.PASTELERIA);

        // Crear un evento de ejemplo
        organizador.crearEvento(101, "Clase de Pastelería", "Aprender técnicas de pastelería avanzada", new Date(), "10:00", "Cocina Central", 20, chef);

        System.out.println("Evento creado por: " + organizador.getNombre());
        chef.mostrarInformacion();
    }
}
