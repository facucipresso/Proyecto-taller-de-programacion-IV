package com.primero.proyecto1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.primero.proyecto1.entity.Bicileta;
import com.primero.proyecto1.service.ServiceBike;
//import jakarta.*;



@RestController
public class Controller {
    
    @Autowired
    private ServiceBike service;
    //voy a hacer una app de un ecomerce de bicis


    @GetMapping("/findAllBikes")
    public List<Bicileta> getAllBikes(){
        return service.findAllBikes();
    }

    @PostMapping("/saveBike")
    public Bicileta saveBike(@RequestBody Bicileta bike){
        return service.saveBike(bike);
    }

    @PutMapping("/updateBike/")
    public Bicileta updateBike(@RequestBody Bicileta bike){
        return service.updateBike(bike);
    }

    @DeleteMapping("/deleteBike/{id}")
    public void deleteBike(@PathVariable Long id){
        service.deleteBike(id);
        return ;
    }

    @GetMapping("/findByTipoAndMarca/{tipo}/{marca}")
    public ResponseEntity<Bicileta> findByTipoAndMarca(@PathVariable String tipo, @PathVariable String marca){
        Bicileta bike = service.findByTipoAndMarca(tipo, marca);
        if(bike == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bike);
    }

    @GetMapping("/allBikes")
    public List<Bicileta> allBikes(){
        return service.mostrarTodas();
    }

}
