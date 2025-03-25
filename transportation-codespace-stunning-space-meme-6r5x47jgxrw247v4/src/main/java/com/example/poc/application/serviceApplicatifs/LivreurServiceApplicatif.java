package com.example.poc.application.serviceApplicatifs;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.poc.application.dto.LivreurDTO;
import com.example.poc.application.mapper.LivreurMapper;
import com.example.poc.domain.model.Livreur;
import com.example.poc.domain.serviceMetier.LivreurMetierService;

@Service
public class LivreurServiceApplicatif {

        private final LivreurMetierService livreurMetierService;
        private final LivreurMapper livreurMapper;

    public LivreurServiceApplicatif(LivreurMetierService livreurMetierService, LivreurMapper  livreurMapper){

        this.livreurMetierService = livreurMetierService;
        this.livreurMapper = livreurMapper;
    }
//recuperer tous les livreurs sous formes DTO
    public List<LivreurDTO> getAllLivreursDTO(){

           List<Livreur> livreurs = livreurMetierService.getAllLivreurs();
           return livreurs.stream().map(livreurMapper::toLivreurDTO).collect(Collectors.toList());

}
   //save livreur 
   public LivreurDTO saveLivreur(LivreurDTO livreurDTO) {
       //convertir livreurDtO en entity
       Livreur livreur = livreurMapper.toLivreur(livreurDTO);
       //sauvgarder dans la base 
       Livreur savedLivreur = livreurMetierService.saveLivreur(livreur);

       //retouner l entite sauvgrader en dto 
       return livreurMapper.toLivreurDTO(savedLivreur);
   }

}

