package com.example.poc.domain.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import com.example.poc.domain.model.Vehicule;
import com.example.poc.domain.model.Livraison;
import com.example.poc.domain.model.Admin;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.poc.domain.model.LivreurRole;
import com.example.poc.domain.model.LivraisonStatut;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

     private long id;

     private String nom;

     private String prenom;

     private String cin;

     private String address;

     private String mdp;

     private String email;

     @Column(name = "num_tel")
     private String numTel;


   
@Enumerated(EnumType.STRING)
private LivreurRole role;

@Enumerated(EnumType.STRING)
private LivreurStatus status;


// Relation One-to-Many avec livraison (Un livreur peut faire plusieurs livraison)
@OneToMany(mappedBy = "livreur" , cascade = CascadeType.ALL) //respensable de maintenir l cle etrangere
private List<Livraison> livraison;//liste des livraisons associes


// Relation ManyToOne  avec Véhicule (Un véhicule peut être associé à plusieurs livreurs au fil du temps)
@ManyToOne
@JoinColumn(name = "vehiculeId")
private Vehicule vehicule;  // Représente le véhicule associé à ce livreur.

//relation ManyToOne avec admin
@ManyToOne
@JoinColumn(name = "admin_id")
private Admin admin;


//constructeuravec parametre
public  Livreur(String nom, String prenom, String cin, String address, String mdp, 
String email, String numTel, LivreurRole role, LivreurStatus status , Vehicule vehicule, Admin admin, List<Livraison> livraison)
{
    this.nom = nom;
    this.prenom = prenom;
    this.cin = cin;
    this.address = address;
    this.mdp = mdp;
    this.email = email;
    this.numTel = numTel;
    this.role = role;
    this.status = status;
    this.vehicule = vehicule;
    this.livraison = livraison;
    this.admin = admin;

}}
