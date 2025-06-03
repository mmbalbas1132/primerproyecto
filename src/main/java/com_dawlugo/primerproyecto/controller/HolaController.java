package com_dawlugo.primerproyecto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com_dawlugo.primerproyecto.model.Cliente; // Asegúrate de que la ruta del paquete sea correcta
@RestController
public class HolaController {
    // Aquí puedes definir tus endpoints y lógica de negocio
    // Por ejemplo, un endpoint simple que retorna un saludo
@PostMapping("/cliente")
public void nuevoCliente(@RequestBody Cliente cli) {
    System.out.println("Nuevo cliente creado con los datos: " + cli.getNombre() + " " + cli.getApellido() + " con ID: " + cli.getId());
}
}
