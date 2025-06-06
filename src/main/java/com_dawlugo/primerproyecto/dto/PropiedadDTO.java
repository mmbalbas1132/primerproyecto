package com_dawlugo.primerproyecto.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter @Setter
public class PropiedadDTO implements Serializable {
    private Long id;
    private String direccion;
    private String tipo; // Casa, departamento, etc.
    private double precio;
    private String nombre;
    private String apellido;

    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id, String direccion, String tipo, double precio, String nombre, String apellido) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
        this.precio = precio;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
