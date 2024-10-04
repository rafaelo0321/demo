package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hola")
public class HolaController {
    @GetMapping
    public ResponseEntity<String> holaMundo(){
        return ResponseEntity.ok("Hola Rafael bienvenido");
    }
    @GetMapping("/h")
    public ResponseEntity<String> holaMundo2(){
        return ResponseEntity.ok("Hola, Bienvenido");
    }
}
