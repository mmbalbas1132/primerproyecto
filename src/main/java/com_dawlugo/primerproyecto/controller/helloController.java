package com_dawlugo.primerproyecto.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {
    // Aquí puedes definir tus endpoints y lógica de negocio
    // Por ejemplo, un endpoint simple que retorna un saludo

    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, mundo!";
    }

    // Puedes agregar más métodos y lógica según sea necesario
    @GetMapping("/greet")
    public String greet() {
        return "¡Saludos desde el controlador!";
    }

    // Puedes agregar más métodos y lógica según sea necesario
    @GetMapping("/welcome")
    public String welcome() {
        return "¡Bienvenido a Spring Boot, una aplicación para desarrollar APIs de Java!";
    }

    //@GetMapping con parámetros
    @GetMapping("/greet/{name}")
    public String greetWithName(@PathVariable String name) {
        return "¡Hola, " + name + "! Bienvenido a Spring Boot.";
    }

    //@GetMapping con parámetros y tipo de dato
    @GetMapping("/greet/{name}/{age}/{profesion}")
    public String greetWithNameAndAge(@PathVariable String name,
                                      @PathVariable int age,
                                      @PathVariable String profesion) {
        return "¡Hola, " + name + "! Tienes " + age + " y eres " + profesion + " años. Bienvenido a Spring Boot.";
    }

    //@GetMapping con @RequestParam
    //El @RequestParam se utiliza para obtener parámetros de la URL
    //La diferencia entre @PathVariable y @RequestParam es que el primero se utiliza para obtener valores de la ruta de la URL, mientras que el segundo se utiliza para obtener valores de los parámetros de consulta (query parameters) en la URL.
    @GetMapping("/saludo")
    public String greetWithRequestParam(@RequestParam String name,
                                        @RequestParam int age,
                                        @RequestParam String profesion) {
        {
            return "¡Hola, " + name + "! Tienes " + age + " años y eres " + profesion + ". Bienvenido a Spring Boot.";
        }


    }


}



