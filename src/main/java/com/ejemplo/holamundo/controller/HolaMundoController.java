package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bla")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println("prueba de log");
        return "Hola Mundo!";
    }

    @GetMapping("/saluda/{nombre_saludo}")
    public String saludaNombre(@PathVariable("nombre_saludo") String nombre_saludo){
        return "hola que tal "+nombre_saludo;
    }

    @GetMapping("/saluda-query")
    public String saludaQueryString(@RequestParam("nombre") String nombre){
        return "hola otro nombre 2"+nombre;
    }
}
