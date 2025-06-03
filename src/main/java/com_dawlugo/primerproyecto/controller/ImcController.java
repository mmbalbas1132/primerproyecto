package com_dawlugo.primerproyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {
    // A partir del IMC en el parámetro de la URL devuelve el estado del peso como Peso insuficiente, Peso normal, Sobrepeso y Obesidad.
    @GetMapping("/imc")
    public String calculateImc(@RequestParam double imc) {
        if (imc < 18.5) {
            return "Peso insuficiente";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}
