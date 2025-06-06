package com_dawlugo.primerproyecto.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    private long id;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(long id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}