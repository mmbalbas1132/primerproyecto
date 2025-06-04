package com_dawlugo.primerproyecto.controller;

import org.springframework.web.bind.annotation.*;
import com_dawlugo.primerproyecto.model.Cliente; // Asegúrate de que la ruta del paquete sea correcta


import java.util.ArrayList;
import java.util.List;


@RestController
public class HolaController {
    // Aquí puedes definir tus endpoints y lógica de negocio
    // Por ejemplo, un endpoint simple que retorna un saludo

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {
        System.out.println("Nuevo cliente creado con los datos: " + cli.getNombre() + " " + cli.getApellido() + " con ID: " + cli.getId());
        System.out.println("Cliente creado correctamente.");
    }


    // Puedes agregar más métodos y lógica según sea necesario usando @ResponseBody

    @GetMapping("/cliente/mostrar")
    @ResponseBody
    public List<Cliente> obtenerClientes() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1L, "Juan", "Pérez"));
        clientes.add(new Cliente(2L, "Ana", "Gómez"));
        clientes.add(new Cliente(3L, "Luis", "Martínez"));
        return clientes;
    }

    //Uso de @ResposeEntity para retornar un objeto JSON
    @GetMapping("/cliente/mostrar/{id}")
    @ResponseBody
    public Cliente obtenerClientePorId(@PathVariable Long id) {
        // Simulando la obtención de un cliente por ID
        Cliente cliente = new Cliente(id, "Nombre" + id, "Apellido" + id);
        return cliente; // Retorna el objeto Cliente como JSON
    }

}
