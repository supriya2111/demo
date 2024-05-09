package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Trekk;
import com.example.demo.repositories.TrekkRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Service
public class TrekkService {

    @Autowired
    TrekkRepository trepo;

   public Trekk saveTrekk(Trekk trekk){
    return trepo.save(trekk);
   }
   
   public List<Trekk> getAllTrekk(){
    return trepo.findAll();
   }
}