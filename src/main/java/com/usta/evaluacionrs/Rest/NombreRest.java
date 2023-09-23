package com.usta.evaluacionrs.Rest;

import com.usta.evaluacionrs.DTO.NombreEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/nombre")
public class NombreRest {

    @GetMapping("nombre")
    private String hello(@Validated @RequestBody NombreEntity nombre) {
        return "Hola mi nombre es " + nombre;
    }

}
