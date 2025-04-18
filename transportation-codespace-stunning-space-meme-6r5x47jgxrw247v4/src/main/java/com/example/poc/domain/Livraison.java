package com.example.poc.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import com.example.poc.domain.User;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Livraison {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
       
       private long id;
       private LivraisonStatut statut;

public Livraison(LivraisonStatut statut)
{
       this.statut= statut;
}

@ManyToOne
@JoinColumn(name = "livreur_id")
private User livreur;

}
