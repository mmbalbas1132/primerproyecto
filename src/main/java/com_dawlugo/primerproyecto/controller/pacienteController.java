package com_dawlugo.primerproyecto.controller;

import com_dawlugo.primerproyecto.model.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

@RestController
public class pacienteController {
    @GetMapping("/pacientesmenores")
    public String mostrarPacientesMenores() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1L, "12345678A", "Juan", "Pérez", "2005-05-15"));
        pacientes.add(new Paciente(2L, "87654321B", "Ana", "Gómez", "2010-10-20"));
        pacientes.add(new Paciente(3L, "11223344C", "Luis", "Martínez", "2000-01-01"));
        pacientes.add(new Paciente(4L, "55667788D", "María", "López", "2015-03-30"));
        pacientes.add(new Paciente(5L, "99887766E", "Carlos", "Sánchez", "2008-08-08"));
        pacientes.add(new Paciente(6L, "22334455F", "Laura", "Ramírez", "2012-12-12"));

        StringBuilder resultado = new StringBuilder("Pacientes menores de edad:\n");
        LocalDate fechaActual = LocalDate.now();
        for (Paciente paciente : pacientes) {
            LocalDate fechaNacimiento = LocalDate.parse(paciente.getFechaNacimiento());
            Period edad = Period.between(fechaNacimiento, fechaActual);
            if (edad.getYears() < 18) {
                resultado.append("ID: ").append(paciente.getId())
                        .append(", DNI: ").append(paciente.getDni())
                        .append(", Nombre: ").append(paciente.getNombre())
                        .append(", Apellido: ").append(paciente.getApellido())
                        .append(", Fecha de Nacimiento: ").append(paciente.getFechaNacimiento())
                        .append("\n");

            }
        }
        return resultado.toString();
    }
}