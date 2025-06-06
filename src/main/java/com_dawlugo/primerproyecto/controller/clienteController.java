package com_dawlugo.primerproyecto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com_dawlugo.primerproyecto.model.Cliente; // Asegúrate de que la ruta del paquete sea correcta


import java.util.ArrayList;
import java.util.List;


@RestController
public class clienteController {
    // Aquí puedes definir tus endpoints y lógica de negocio
    // Por ejemplo, un endpoint simple que retorna un saludo
    //Con @postmapping puedes crear un nuevo cliente

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
    ResponseEntity<Cliente> obtenerCliente(@PathVariable Long id) {
        Cliente cliente = new Cliente(id, "Nombre" + id, "Apellido" + id);
        // Aquí puedes buscar el cliente por ID en una base de datos o lista
        // Por simplicidad, estamos creando un cliente ficticio
        if (cliente != null) {
            return ResponseEntity.ok(cliente); // Retorna el cliente encontrado
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 si no se encuentra el cliente
        }
    }


}
