package com_dawlugo.primerproyecto.model.inmobiliaria;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Inquilino {
    // Un inquilino cuenta con una lista de inmuebles y de cada uno de ellos cuenta con los datos: id, nombre, apellido, dni, fecha de nacimiento, email y teléfono.
    private Long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento; // Fecha de nacimiento en formato LocalDate
    private String email;
    private String telefono;

    public Inquilino() {
    }

    public Inquilino(Long id, String nombre, String apellido, String dni, String fechaNacimiento, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }


}
