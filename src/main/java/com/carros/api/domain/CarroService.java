/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carros.api.domain;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author adaumir
 */
@Service
public class CarroService {
    
    public List<Carro> getCarros(){
        List<Carro> carros = new ArrayList<>();
        
        carros.add(new Carro(1L, "Fusca"));
        carros.add(new Carro(2L, "Brasilia"));
        carros.add(new Carro(3L, "Chevette"));
        
        return carros;
    }
    
}
