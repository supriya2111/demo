package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Trekk;
import com.example.demo.services.TrekkService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin(origins="*")
public class TrekkController {

    @Autowired
    TrekkService tservice;

    @PostMapping("trekks/add")
    public Trekk saveTrekk(@RequestBody Trekk trekk) {
        
        return tservice.saveTrekk(trekk);
    }
    
    @GetMapping("/trekks")
    public List<Trekk> getAllTrekks() {
        return tservice.getAllTrekk();
    }
    
}