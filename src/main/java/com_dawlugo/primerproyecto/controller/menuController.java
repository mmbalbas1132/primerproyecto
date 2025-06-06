package com_dawlugo.primerproyecto.controller;

import com_dawlugo.primerproyecto.model.Plato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class menuController {

    @GetMapping("/menu/mostrar/{id}")
    public Plato mostrarPlatoPorId(@PathVariable Long id) {
        List<Plato> platos = new ArrayList<>();
        platos.add(new Plato(1L, "Pizza", 8.99, "Deliciosa pizza con queso y pepperoni"));
        platos.add(new Plato(2L, "Hamburguesa", 6.49, "Jugosa hamburguesa con lechuga y tomate"));
        platos.add(new Plato(3L, "Ensalada César", 5.99, "Ensalada fresca con aderezo César"));

        return platos.stream()
                .filter(plato -> plato.getId() == id)
                .findFirst()
                .orElse(new Plato(0L, "No encontrado", 0.0, "Plato no encontrado"));
    }
}