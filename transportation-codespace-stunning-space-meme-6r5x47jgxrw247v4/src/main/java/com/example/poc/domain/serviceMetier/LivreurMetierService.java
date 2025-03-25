package com.example.poc.domain.serviceMetier;

import com.example.poc.domain.model.Livreur;

import java.util.List;
import java.util.Optional;





public interface LivreurMetierService {

    List<Livreur> getAllLivreurs();
    Optional<Livreur> getLivreurById(Long id);
    Livreur saveLivreur(Livreur livreur);
    void deleteLivreur(Livreur livreur);

}
