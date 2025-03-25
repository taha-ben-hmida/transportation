package com.example.poc.infrastructure.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.poc.application.dto.LivreurDTO;

import com.example.poc.application.serviceApplicatifs.LivreurServiceApplicatif;

@RestController
@RequestMapping("/livreur")  // <-- Définit la route de base
public class LivreurController {

    private final LivreurServiceApplicatif livreurServiceApplicatif;

    public LivreurController(LivreurServiceApplicatif livreurServiceApplicatif) {
        this.livreurServiceApplicatif = livreurServiceApplicatif;
    }

    @GetMapping
    public List<LivreurDTO> getAllLivreurs() {
        return livreurServiceApplicatif.getAllLivreursDTO();

    }

    @PostMapping("/savelivreur")
    public ResponseEntity<LivreurDTO> saveLivreur(@RequestBody LivreurDTO livreurDto)

    { 
        System.out.println("Requête reçue pour sauver un livreur : " + livreurDto);

        LivreurDTO  savedLivreur = livreurServiceApplicatif.saveLivreur(livreurDto);
       
        return  new ResponseEntity<>(savedLivreur,HttpStatus.CREATED);
    }
}


