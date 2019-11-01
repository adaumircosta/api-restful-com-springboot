/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carros.api;

import com.carros.api.domain.Carro;
import com.carros.api.domain.CarroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adaumir
 */
@RestController
@RequestMapping("/api/v1/carros")
public class CarroController {
    
    @Autowired
    private CarroService service;
    
    @GetMapping
    public List<Carro> get(){
        return service.getCarros();
    }
    
    
}
