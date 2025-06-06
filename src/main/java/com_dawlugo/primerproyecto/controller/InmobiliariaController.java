package com_dawlugo.primerproyecto.controller;

import com_dawlugo.primerproyecto.dto.PropiedadDTO;
import com_dawlugo.primerproyecto.model.inmobiliaria.Inmueble;
import com_dawlugo.primerproyecto.model.inmobiliaria.Inquilino;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// Este controlador es un ejemplo de cómo podrías estructurar un controlador para una inmobiliaria.
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class InmobiliariaController {
    @GetMapping("/inmueble/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long id) {

        // A través del ID, buscaríamos la propiedad en la base de datos.
        Inmueble inmueble = new Inmueble(12l, "Calle Falsa 123", "Casa", 150000.0, 120.5, 3);

        Inquilino inquilino = new Inquilino(1L, "Juan", "Pérez", "33326768T", "1987-01-04", "inqulino@inmobiliaria.es", "287252525");

        // Creamos un DTO para devolver la información de la propiedad.

        PropiedadDTO propiedadDTO = new PropiedadDTO();

        // Asignamos los valores del inmueble
        propiedadDTO.setId(inmueble.getId());
        propiedadDTO.setDireccion(inmueble.getDireccion());
        propiedadDTO.setTipo(inmueble.getTipo());
        propiedadDTO.setPrecio(inmueble.getPrecio());
        // Asignamos los valores del inquilino
        propiedadDTO.setNombre(inquilino.getNombre());
        propiedadDTO.setApellido(inquilino.getApellido());

        // Aquí podrías agregar más lógica para manejar errores, como si el inmueble no se encuentra.
        return propiedadDTO;

    }


}
