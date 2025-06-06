package com_dawlugo.primerproyecto.model.inmobiliaria;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inmueble {
    // Un inmueble cuenta con una lista de inquilinos y de cada uno de ellos cuenta con los datos: id, dirección, tipo (casa, departamento, etc.), precio, superficie y número de habitaciones.
    private Long id;
    private String direccion;
    private String tipo; // Casa, departamento, etc.
    private double precio;
    private double superficie; // En metros cuadrados
    private int numeroHabitaciones;

    public Inmueble() {
    }

    public Inmueble(Long id, String direccion, String tipo, double precio, double superficie, int numeroHabitaciones) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
        this.precio = precio;
        this.superficie = superficie;
        this.numeroHabitaciones = numeroHabitaciones;
    }


}
