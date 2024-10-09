package com.tu_proyecto.service;

import com.tu_proyecto.domain.Chef;
import java.util.ArrayList;
import java.util.List;

public class ChefService {
    private List<Chef> chefs = new ArrayList<>();

    public void registrarChef(Chef chef) {
        chefs.add(chef);
    }

    public List<Chef> obtenerChefs() {
        return chefs;
    }
}
