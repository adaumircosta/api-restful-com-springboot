/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adaumir
 */
@RestController
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public String hello(){
        return "Hello Spring Boot";
    }
    
    @GetMapping("/teste")
    public String teste(){
        return "Teste Spring Boot";
    }
    
    
}
