package com_dawlugo.primerproyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class fuelController {
    // Aquí puedes definir tus endpoints y lógica de negocio relacionados con el combustible
    // Por ejemplo, un endpoint simple que retorna un mensaje de bienvenida

    @GetMapping("/fuel")
    public String getFuelInfo(@RequestParam Double galons) {
        // Lógica para calcular información sobre el combustible
        Double liters = galons * 3.78541; // Conversión de galones a litros

        return "La cantidad de litros es: " + liters + " litros.";
    }


}
//también se puede hacer con @PathVariable

//package com_dawlugo.primerproyecto.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class FuelController {
//
//    @GetMapping("/fuel/{galons}")
//    public String getFuelInfo(@PathVariable Double galons) {
//        Double liters = galons * 3.78541; // Conversión de galones a litros
//        return "La cantidad de litros es: " + liters + " litros.";
//    }
//}
