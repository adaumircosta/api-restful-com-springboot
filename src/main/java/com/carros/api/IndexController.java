/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adaumir
 */
@RestController
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public String get(){
        return "Get Spring Boot";
    }
    
    @GetMapping("/login/{login}/senha/{senha}")
    public String login(@PathVariable("login") String login, @PathVariable("senha") String senha){
        return "Login " + login + ", senha: "+ senha;
    }
    
    @GetMapping("/carros/{id}")
    public String getCarroById(@PathVariable("id") Long id){
        return "Carro " + id;
    }
    
    @GetMapping("/carros/tipo/{tipo}")
    public String getCarroById(@PathVariable("tipo") String tipo){
        return "Lista de Carros " + tipo;
    }
    
    
}
