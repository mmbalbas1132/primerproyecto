package com_dawlugo.primerproyecto.model;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente {
    //Un odntologo cuenta con una lista de pacientes y de cada uno de ellos cuenta con los datos: id, dni, nombre, apellido uy fecha de nacimento.
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    // Fecha de nacimiento en formato LocalDate
    private String fechaNacimiento;





    public Paciente() {
    }

    public Paciente(Long id, String dni, String nombre, String apellido, String fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
}
