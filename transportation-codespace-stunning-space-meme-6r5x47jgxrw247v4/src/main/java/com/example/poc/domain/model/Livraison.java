package com.example.poc.domain.model;

import java.util.List;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Livraison {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
       
       private long id;

       @Enumerated(EnumType.STRING)
       private LivraisonStatut statut;

// la gestion de la relation se fait via l'attribut livraison dans l'entité Colis
       @OneToMany(mappedBy = "livraison")
       //  Liste de colis associés à cette livraison
       private List<Colis> colis;

       @ManyToOne
       @JoinColumn(name = "livreur_id")
       private Livreur livreur;

}
