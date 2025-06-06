package com_dawlugo.primerproyecto.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;

    // Constructor por defecto
    public Cliente() {
        // Constructor por defecto
    }

    // Constructor con parámetros

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
