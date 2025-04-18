package com.example.poc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Colis {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

private long id;
private String description;
private String destinataire;
private FragiliteColis fragiliteColis;

@ManyToOne
@JoinColumn(name = "livraison_id")
// Référence à l'objet Livraison auquel ce colis est associé
private Livraison livraison;

}
